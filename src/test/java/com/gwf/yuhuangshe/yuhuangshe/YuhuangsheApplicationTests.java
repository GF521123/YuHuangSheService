package com.gwf.yuhuangshe.yuhuangshe;

import com.gwf.yuhuangshe.service.PDF2OtherService;
import com.gwf.yuhuangshe.serviceImpl.PDF2OtherServiceImpl;
import com.gwf.yuhuangshe.utils.CryptoUtil;
import com.gwf.yuhuangshe.utils.HashUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YuhuangsheApplicationTests {
    //    @Autowired
//    private

    @Autowired
    private PDF2OtherServiceImpl pDF2OtherService;
    @Test
    void contextLoads() {
        pDF2OtherService.PDF2Word();
//        System.out.println(hashUtil.eccrypt("admin"));
//        System.out.println(hashUtil.eccrypt("123"));
//        System.out.println(hashUtil.eccrypt("123"));
//        System.out.println(CryptoUtil.decode("Rs06rm4NiNE"));


    }
}