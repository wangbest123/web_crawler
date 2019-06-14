package com.cn.parser;

import com.cn.pojo.HTML;
import com.cn.pojo.MyURL;

/**
 * Created by wangmeng on 2019/6/14.
 */
public class DataParser implements Parser {

    public static MyURL getURLFromHTM(HTML html) {
        return new MyURL();
    }
}
