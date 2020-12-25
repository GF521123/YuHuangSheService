package com.gwf.yuhuangshe.service;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.entity.Relation;
import org.springframework.stereotype.Repository;

@Repository
public interface RelationService {
    public JSONObject selRelations(Integer page, Integer pageSize);
    public JSONObject insertRelation(Relation relation);
    public JSONObject updateRelationById(Relation relation);
    public JSONObject delRelationById(Relation relation);
}
