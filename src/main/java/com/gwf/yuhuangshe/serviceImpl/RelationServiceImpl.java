package com.gwf.yuhuangshe.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.gwf.yuhuangshe.dao.RelationMapper;
import com.gwf.yuhuangshe.entity.Relation;
import com.gwf.yuhuangshe.service.RelationService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class RelationServiceImpl implements RelationService {
    @Autowired
    private RelationMapper relationMapper;

    @Override
    public JSONObject selRelations(Integer page, Integer pageSize){
        JSONObject resultJson = new JSONObject();
        PageHelper.startPage(page, pageSize);
        List<Relation> roleList = relationMapper.selRelations();
        PageInfo<Relation> pageInfo = new PageInfo<>(roleList);

        resultJson.put("total",pageInfo.getTotal());
        resultJson.put("rows",pageInfo.getList());
        return resultJson;
    }

    @Override
    public JSONObject insertRelation(Relation relation) {
        JSONObject resultJson = new JSONObject();
        int resultInsert = relationMapper.insertRelation(relation);
        resultJson.put("code",0);
        if(resultInsert == 1){
            resultJson.put("msg","新建成功");
        }else{
            resultJson.put("msg","新建失败");
        }
        return resultJson;
    }
    @Override
    public JSONObject updateRelationById(Relation relation){
        JSONObject resultJson = new JSONObject();
        int resultUpdate = relationMapper.updateRelationById( relation);
        resultJson.put("code",0);
        if(resultUpdate == 1){
            resultJson.put("msg","修改成功");
        }else{
            resultJson.put("msg","修改失败");
        }
        return resultJson;
    }

    @Override
    public JSONObject delRelationById(Relation relation){
        JSONObject resultJson = new JSONObject();
        int resultUpdate = relationMapper.delRelationById( relation);
        resultJson.put("code",0);
        if(resultUpdate == 1){
            resultJson.put("msg","删除成功");
        }else{
            resultJson.put("msg","删除失败");
        }
        return resultJson;
    }
}
