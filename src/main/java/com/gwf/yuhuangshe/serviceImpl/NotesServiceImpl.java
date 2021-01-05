package com.gwf.yuhuangshe.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gwf.yuhuangshe.dao.NotesMapper;
import com.gwf.yuhuangshe.entity.Notes;
import com.gwf.yuhuangshe.entity.User;
import com.gwf.yuhuangshe.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;
@Service
public class NotesServiceImpl implements NotesService {
    @Autowired
    private NotesMapper notesMapper;

    @Override
    public JSONObject selNotes(HttpServletRequest request, Integer page, Integer pageSize) {
        JSONObject resultJson = new JSONObject();
        PageHelper.startPage(page, pageSize);
        HttpSession session = request.getSession();
        User user = (User) session.getAttribute("loginUser");
        List<Notes> roleList = notesMapper.selNotes(user.getUId());
        PageInfo<Notes> pageInfo = new PageInfo<>(roleList);

        resultJson.put("total",pageInfo.getTotal());
        resultJson.put("rows",pageInfo.getList());
        return resultJson;
    }

    @Override
    public JSONObject insertNote(HttpServletRequest request,Notes notes) {
        JSONObject resultJson = new JSONObject();
        HttpSession session = request.getSession();
        notes.setCreateTime(new Date());
        User user = (User) session.getAttribute("loginUser");
        notes.setUid(user.getUId());
        int restInsert =  notesMapper.insertNote(notes);
        resultJson.put("code",0);
        if(restInsert == 1){
            resultJson.put("msg","修改成功");
        }else{
            resultJson.put("msg","修改失败");
        }
        return resultJson;
    }

    @Override
    public JSONObject updateNoteById(Notes notes) {
        JSONObject resultJson = new JSONObject();
        int resultUpdate = notesMapper.updateNoteById( notes);
        resultJson.put("code",0);
        if(resultUpdate == 1){
            resultJson.put("msg","修改成功");
        }else{
            resultJson.put("msg","修改失败");
        }
        return resultJson;
    }

    @Override
    public JSONObject delNoteById(Notes notes) {
        JSONObject resultJson = new JSONObject();
        int resultUpdate = notesMapper.delNoteById( notes);
        resultJson.put("code",0);
        if(resultUpdate == 1){
            resultJson.put("msg","删除成功");
        }else{
            resultJson.put("msg","删除失败");
        }
        return resultJson;
    }
}
