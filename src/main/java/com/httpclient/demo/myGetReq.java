package com.httpclient.demo;

import org.apache.http.HttpEntity;
import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;

public class myGetReq {

    public String doGetReq(String url) {
        CloseableHttpClient httpClient = HttpClientBuilder
                .create()
                .build();
        HttpGet httpGet = new HttpGet(url);

        CloseableHttpResponse response = null;

        try {
            response = httpClient.execute(httpGet);
            HttpEntity responseEntity = response.getEntity();
            System.out.println("响应状态为："+response.getStatusLine());
            System.out.println("响应内容为："+ EntityUtils.toString(responseEntity));
            httpClient.close();
            response.close();

            //返回响应内容
            return EntityUtils.toString(responseEntity);

        } catch (IOException e) {
            e.printStackTrace();
            return null;
        }
    }

    @Test
    public void testDoGet() throws IOException {
        String connt = doGetReq("http://www.baidu.com");
        System.out.println(connt);
    }
}
