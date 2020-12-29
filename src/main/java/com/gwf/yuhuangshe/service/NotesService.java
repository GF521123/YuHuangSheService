package com.gwf.yuhuangshe.service;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.Notes;
import org.springframework.stereotype.Repository;

@Repository
public interface NotesService {
    public JSONObject selNotes(Integer page, Integer pageSize);
    public JSONObject insertNote(Notes notes);
    public JSONObject updateNoteById(Notes notes);
    public JSONObject delNoteById(Notes notes);
}
