package com.cn.html;

import com.cn.parser.DataParser;
import com.cn.pojo.HTML;
import com.cn.pojo.MyURL;
import com.cn.tools.HTTPClientUtils;

import java.sql.DatabaseMetaData;
import java.util.HashSet;

import static com.cn.parser.DataParser.getURLFromHTM;

/**
 * Created by wangmeng on 2019/6/14.
 */
public class HomeHTML {

    public HashSet<MyURL> homeURLs(String url) {
        HTML html = HTTPClientUtils.get(url);
        MyURL url_1 = DataParser.getURLFromHTM(html);
        HashSet<MyURL> result = new HashSet<MyURL>();
        result.add(url_1);
        return result;
    }

}
