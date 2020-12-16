package com.gwf.yuhuangshe.utilsImpl;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.Utils.JsonUtils;

import java.util.Map;

public class JsonUtilsImpl implements JsonUtils {


    @Override
    public JSONObject toJSONObject(int code, String msg, Map value ) {
        JSONObject json = new JSONObject();
        json.put("code",code);
        json.put("msg",msg);
//        json.put(value.toString());
        return json;
    }
}
