package com.gwf.yuhuangshe.controller;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.Relation;

public interface RelationController {
    public JSONObject selRelations(Integer page, Integer pageSize);
    public JSONObject insertRelation(Relation relation);
    public JSONObject updateRelationById(Relation relation);
    public JSONObject delRelationById(Relation relation);
}
