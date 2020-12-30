package com.gwf.yuhuangshe.yuhuangshe;

import com.gwf.yuhuangshe.utils.CryptoUtil;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class YuhuangsheApplicationTests {
//    @Autowired
//    private
    @Test
    void contextLoads() {
        System.out.println(CryptoUtil.encode("123"));
//        System.out.println(CryptoUtil.decode("wouWVIuxfZdbiO10hazicA"));
    }

}
