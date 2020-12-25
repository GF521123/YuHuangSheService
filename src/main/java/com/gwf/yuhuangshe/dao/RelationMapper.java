package com.gwf.yuhuangshe.dao;

import com.gwf.yuhuangshe.entity.Relation;

import java.util.List;

public interface RelationMapper {
    List<Relation> selRelations();
    int insertRelation(Relation relation);
    int updateRelationById(Relation relation);
    int delRelationById(Relation relation);
}
