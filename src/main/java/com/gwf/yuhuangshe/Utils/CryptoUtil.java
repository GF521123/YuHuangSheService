package com.gwf.yuhuangshe.utils;

import com.gwf.yuhuangshe.utilsImpl.CryptoUtilImpl;

public interface CryptoUtil {
//    加密
    public static String encode(String str) {
        return CryptoUtilImpl.encode(null, str);
    }
//    解密
    public static String decode(String str) {
        return CryptoUtilImpl.decode(null, str);
    }
}
