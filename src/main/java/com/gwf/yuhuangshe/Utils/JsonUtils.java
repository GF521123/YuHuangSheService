package com.gwf.yuhuangshe.Utils;

import com.alibaba.fastjson.JSONObject;

import java.util.Map;

public interface JsonUtils {
    public JSONObject toJSONObject(int code, String msg, Map value);
}
