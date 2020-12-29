package com.gwf.yuhuangshe.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gwf.yuhuangshe.dao.NoteTypeMapper;
import com.gwf.yuhuangshe.entity.NoteType;
import com.gwf.yuhuangshe.service.NoteTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class NoteTypeServiceImpl implements NoteTypeService {
    @Autowired
    private NoteTypeMapper noteTypeMapper;

    @Override
    public JSONObject selNoteTypes(Integer page, Integer pageSize){
        JSONObject resultJson = new JSONObject();
        PageHelper.startPage(page, pageSize);
        List<NoteType> roleList = noteTypeMapper.selNoteTypes();
        PageInfo<NoteType> pageInfo = new PageInfo<>(roleList);

        resultJson.put("total",pageInfo.getTotal());
        resultJson.put("rows",pageInfo.getList());
        return resultJson;
    }

    @Override
    public JSONObject insertNoteType(NoteType noteType) {
        JSONObject resultJson = new JSONObject();
        int resultInsert = noteTypeMapper.insertNoteType(noteType);
        resultJson.put("code",0);
        if(resultInsert == 1){
            resultJson.put("msg","新建成功");
        }else{
            resultJson.put("msg","新建失败");
        }
        return resultJson;
    }
    @Override
    public JSONObject updateNoteTypeById(NoteType noteType){
        JSONObject resultJson = new JSONObject();
        int resultUpdate = noteTypeMapper.updateNoteTypeById( noteType);
        resultJson.put("code",0);
        if(resultUpdate == 1){
            resultJson.put("msg","修改成功");
        }else{
            resultJson.put("msg","修改失败");
        }
        return resultJson;
    }

    @Override
    public JSONObject delNoteTypeById(NoteType noteType){
        JSONObject resultJson = new JSONObject();
        int resultUpdate = noteTypeMapper.delNoteTypeById( noteType);
        resultJson.put("code",0);
        if(resultUpdate == 1){
            resultJson.put("msg","删除成功");
        }else{
            resultJson.put("msg","删除失败");
        }
        return resultJson;
    }
}
