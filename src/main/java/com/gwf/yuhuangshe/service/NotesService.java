package com.gwf.yuhuangshe.service;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.Notes;
import org.springframework.stereotype.Repository;

import javax.servlet.http.HttpServletRequest;

@Repository
public interface NotesService {
    public JSONObject selNotes(HttpServletRequest request, Integer page, Integer pageSize);
    public JSONObject insertNote(HttpServletRequest request,Notes notes);
    public JSONObject updateNoteById(Notes notes);
    public JSONObject delNoteById(Notes notes);
}
