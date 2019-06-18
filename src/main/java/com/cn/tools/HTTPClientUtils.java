package com.cn.tools;

import com.cn.pojo.HTML;

import java.io.BufferedReader;
import java.io.InputStream;
import java.net.HttpURLConnection;

/**
 * Created by dell on 2019/6/14.
 */
public class HTTPClientUtils {
    static HTML html = new HTML();

  public static HTML get(String url) {

      HttpURLConnection connection = null;
      InputStream is = null;
      BufferedReader br = null;
      String resutl = null;

      html.setHtml("");
      return html;
  }

}
