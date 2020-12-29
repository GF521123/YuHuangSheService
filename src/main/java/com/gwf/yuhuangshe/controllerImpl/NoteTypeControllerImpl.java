package com.gwf.yuhuangshe.controllerImpl;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.controller.NoteTypeController;
import com.gwf.yuhuangshe.entity.NoteType;
import com.gwf.yuhuangshe.service.NoteTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class NoteTypeControllerImpl implements NoteTypeController{
    @Autowired
    private NoteTypeService noteTypeService;

    @RequestMapping("/selNoteTypes")
    @ResponseBody
    @Override
    public JSONObject selNoteTypes(Integer page, Integer pageSize) {
        return noteTypeService.selNoteTypes(page,pageSize);
    }

    @RequestMapping("/insertNoteType")
    @ResponseBody
    @Override
    public JSONObject insertNoteType(NoteType noteType) {
        return noteTypeService.insertNoteType(noteType);
    }

    @RequestMapping("/updateNoteTypeById")
    @ResponseBody
    @Override
    public JSONObject updateNoteTypeById(NoteType noteType) {
        return noteTypeService.updateNoteTypeById(noteType);
    }

    @RequestMapping("/delNoteTypeById")
    @ResponseBody
    @Override
    public JSONObject delNoteTypeById(NoteType noteType){
        return noteTypeService.delNoteTypeById(noteType);
    }
}
