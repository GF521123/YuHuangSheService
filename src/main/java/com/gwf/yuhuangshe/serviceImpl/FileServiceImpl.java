package com.gwf.yuhuangshe.serviceImpl;

import com.alibaba.fastjson.JSONObject;
import com.gwf.yuhuangshe.service.FileService;
import com.spire.pdf.FileFormat;
import com.spire.pdf.PdfDocument;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.IOException;

@Service
public class FileServiceImpl implements FileService {
    private static final Logger logger = LoggerFactory.getLogger(FileServiceImpl.class);
    private static final String filePath = System.getProperty("user.dir")+"\\fileUpload\\";


    @Override
    public JSONObject upload(MultipartFile file) {
        JSONObject json = new JSONObject();
        try {
            if (file.isEmpty()) {
                json.put("code","2");
                json.put("msg","文件为空");
                return json;
            }
            //获取文件名
            String fileName = file.getOriginalFilename();
            //设置文件的存储路径
            String path = filePath + fileName;
            logger.info("上传的文件名是:" + path);
            File dest = new File(path);
            //检测是都存在目录
            if (!dest.getParentFile().exists()) {
                dest.getParentFile().mkdirs(); //新建文件夹
            }
            file.transferTo(dest); //文件写入
            json.put("code","0");
            json.put("msg","上传成功");
            return json;
        } catch (IOException e) {
            json.put("code","1");
            e.printStackTrace();
            return json;
        }
    }

    public void PDF2Word(){
        PdfDocument pdf = new PdfDocument();
        pdf.loadFromFile("F:\\3.pdf");
        pdf.saveToFile("F:\\3.docx", FileFormat.DOCX);
        System.out.println("转换over");
    }

}
