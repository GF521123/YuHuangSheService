package com.gwf.yuhuangshe.controllerImpl;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.service.RelationService;
import com.gwf.yuhuangshe.entity.Relation;
import com.gwf.yuhuangshe.controller.RelationController;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class RelationControllerImpl implements RelationController{
    @Autowired
    private RelationService relationService;

    @RequestMapping("/selRelations")
    @ResponseBody
    @Override
    public JSONObject selRelations(Integer page, Integer pageSize) {
        return relationService.selRelations(page,pageSize);
    }

    @RequestMapping("/insertRelation")
    @ResponseBody
    @Override
    public JSONObject insertRelation(Relation relation) {
        return relationService.insertRelation(relation);
    }

    @RequestMapping("/updateRelationById")
    @ResponseBody
    @Override
    public JSONObject updateRelationById(Relation relation) {
        return relationService.updateRelationById(relation);
    }

    @RequestMapping("/delRelationById")
    @ResponseBody
    @Override
    public JSONObject delRelationById(Relation relation){
        return relationService.delRelationById(relation);
    }
}
