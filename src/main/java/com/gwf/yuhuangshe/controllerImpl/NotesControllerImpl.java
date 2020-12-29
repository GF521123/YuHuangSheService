package com.gwf.yuhuangshe.controllerImpl;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.controller.NotesController;
import com.gwf.yuhuangshe.entity.Notes;
import com.gwf.yuhuangshe.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

public class NotesControllerImpl implements NotesController {
    @Autowired
    private NotesService notesService;

    @RequestMapping("/selNotesInfor")
    @ResponseBody
    @Override
    public JSONObject selNotes(Integer page, Integer pageSize) {
        return notesService.selNotes(page,pageSize);
    }

    @RequestMapping()
    @ResponseBody
    @Override
    public JSONObject insertNote(Notes notes) {
        return notesService.insertNote(notes);
    }

    @RequestMapping()
    @ResponseBody
    @Override
    public JSONObject updateNoteById(Notes notes) {
        return notesService.updateNoteById(notes);
    }

    @RequestMapping()
    @ResponseBody
    @Override
    public JSONObject delNoteById(Notes notes) {
        return notesService.delNoteById(notes);
    }
}
