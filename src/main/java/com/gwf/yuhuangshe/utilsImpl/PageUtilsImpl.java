package com.gwf.yuhuangshe.utilsImpl;

import com.gwf.yuhuangshe.utils.PageUtils;

public class PageUtilsImpl implements PageUtils {
    public PageUtilsImpl(){}

    public int PageNumber_PageNo(int pageNumber,int PageSize){
        return PageSize/pageNumber + 1;
    }
}
