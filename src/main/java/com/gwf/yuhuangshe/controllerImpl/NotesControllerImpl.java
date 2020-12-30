package com.gwf.yuhuangshe.controllerImpl;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.controller.NotesController;
import com.gwf.yuhuangshe.entity.Notes;
import com.gwf.yuhuangshe.service.NotesService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
@Controller
public class NotesControllerImpl implements NotesController {
    @Autowired
    private NotesService notesService;

    @Override
    @RequestMapping("/selUserNotes")
    @ResponseBody
    public JSONObject selNotes(HttpServletRequest request, Integer page, Integer pageSize) {
        return notesService.selNotes(request,page,pageSize);
    }

    @RequestMapping("/insertNote")
    @ResponseBody
    @Override
    public JSONObject insertNote(HttpServletRequest request,Notes notes) {
        return notesService.insertNote(request,notes);
    }

    @RequestMapping("/updateNoteById")
    @ResponseBody
    @Override
    public JSONObject updateNoteById(Notes notes) {
        return notesService.updateNoteById(notes);
    }

    @RequestMapping("/delNoteById")
    @ResponseBody
    @Override
    public JSONObject delNoteById(Notes notes) {
        return notesService.delNoteById(notes);
    }
}
