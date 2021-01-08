package com.gwf.yuhuangshe.service;

import com.alibaba.fastjson.JSONObject;
import org.springframework.stereotype.Repository;
import org.springframework.web.multipart.MultipartFile;
@Repository
public interface FileService {
    JSONObject upload(MultipartFile file);
}
