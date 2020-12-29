package com.gwf.yuhuangshe.controller;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.NoteType;
import com.gwf.yuhuangshe.entity.Relation;

public interface NoteTypeController {
    public JSONObject selNoteTypes(Integer page, Integer pageSize);
    public JSONObject insertNoteType(NoteType noteType);
    public JSONObject updateNoteTypeById(NoteType noteType);
    public JSONObject delNoteTypeById(NoteType noteType);
}
