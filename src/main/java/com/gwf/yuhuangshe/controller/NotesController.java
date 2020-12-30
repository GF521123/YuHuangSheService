package com.gwf.yuhuangshe.controller;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.Notes;

import javax.servlet.http.HttpServletRequest;


public interface NotesController {
    public JSONObject selNotes(HttpServletRequest request, Integer page, Integer pageSize);
    public JSONObject insertNote(Notes notes);
    public JSONObject updateNoteById(Notes notes);
    public JSONObject delNoteById(Notes notes);
}
