package com.gwf.yuhuangshe.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gwf.yuhuangshe.dao.NotesMapper;
import com.gwf.yuhuangshe.entity.NoteType;
import com.gwf.yuhuangshe.entity.Notes;
import com.gwf.yuhuangshe.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

public class NotesServiceImpl implements NotesService {
    @Autowired
    private NotesMapper notesMapper;

    @Override
    public JSONObject selNotes(Integer page, Integer pageSize) {
        JSONObject resultJson = new JSONObject();
        PageHelper.startPage(page, pageSize);
        List<Notes> roleList = notesMapper.selNotes();
        PageInfo<Notes> pageInfo = new PageInfo<>(roleList);

        resultJson.put("total",pageInfo.getTotal());
        resultJson.put("rows",pageInfo.getList());
        return resultJson;
    }

    @Override
    public JSONObject insertNote(Notes notes) {
        return null;
    }

    @Override
    public JSONObject updateNoteById(Notes notes) {
        return null;
    }

    @Override
    public JSONObject delNoteById(Notes notes) {
        return null;
    }
}
