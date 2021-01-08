package com.gwf.yuhuangshe.controller;

import com.alibaba.fastjson.JSONObject;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.multipart.MultipartFile;

public interface FileController {
    public JSONObject upload(@RequestParam("file") MultipartFile file);
}
