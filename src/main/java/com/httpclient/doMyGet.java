package com.httpclient;

import org.apache.http.client.HttpClient;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.DefaultHttpClient;
import org.testng.annotations.Test;

public class doMyGet {

    public String doGet(String url){

        //存放结果
        String result = null;


        HttpGet myget = new HttpGet(url);
        HttpClient httpClient = new DefaultHttpClient();


        return result;
    }
}
