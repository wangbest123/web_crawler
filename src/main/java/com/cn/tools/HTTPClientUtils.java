package com.cn.tools;

import com.cn.pojo.HTML;

/**
 * Created by dell on 2019/6/14.
 */
public class HTTPClientUtils {

  public static HTML get(String url) {
      HTML html = new HTML();
      html.setHtml("");
      return html;
  }

}
