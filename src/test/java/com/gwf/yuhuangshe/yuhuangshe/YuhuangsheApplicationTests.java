package com.gwf.yuhuangshe.yuhuangshe;

import com.gwf.yuhuangshe.serviceImpl.FileServiceImpl;
import com.spire.pdf.FileFormat;
import com.spire.pdf.PdfDocument;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;



@SpringBootTest
class YuhuangsheApplicationTests {
    //    @Autowired
//    private

    @Autowired
    private FileServiceImpl fileService;
    @Test
    void contextLoads() {
        System.out.println("得到的是当前的classpath的绝对URI路径:"+ System.getProperty("user.dir"));

        PdfDocument pdf = new PdfDocument();

        pdf.loadFromFile("F:\\3.pdf");
        pdf.saveToFile("F:\\3.docx", FileFormat.DOCX);
        System.out.println("转换over");


    }
}