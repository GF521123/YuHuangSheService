package com.gwf.yuhuangshe.service;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.NoteType;
import org.springframework.stereotype.Repository;

@Repository
public interface NoteTypeService {
    public JSONObject selNoteTypes(Integer page, Integer pageSize);
    public JSONObject insertNoteType(NoteType noteType);
    public JSONObject updateNoteTypeById(NoteType noteType);
    public JSONObject delNoteTypeById(NoteType noteType);
}
