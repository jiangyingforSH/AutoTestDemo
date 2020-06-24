package com.okhttp;


import com.sun.deploy.net.HttpUtils;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import org.testng.annotations.Test;

import java.io.IOException;


public class myGetRequest {
    //创建okhttp客户端
    OkHttpClient okHttpClient = new OkHttpClient();
    //构造方法
    public myGetRequest(String url){

    }


    OkHttpClient.Builder builder = new OkHttpClient.Builder();

    //ssl
    //httputils.SSLParams sslParams = ht

    public String myGetReq(String url){
        Response response = null;

        Request request = new Request.Builder()
                .get()//get请求
                .url(url)//请求地址
                //.header("","")
                .addHeader("Cookie","Hm_lvt_6a838289d584863ecc7d24b064b885e2=1584366001; UM_distinctid=170e3929a7179-00240fed891b898-3d7e032c-4a574-170e3929a7319f")
                .addHeader("accept","text/html,application/xhtml+xml,application/xml;q=0.9,*/*;q=0.8")
                .addHeader("user-agent","Mozilla/5.0 (iPhone; CPU iPhone OS 13_5 like Mac OS X) AppleWebKit/605.1.15 (KHTML, like Gecko) Mobile/15E148 MicroMessenger/7.0.12(0x17000c30) NetType/WIFI Language/zh_CN")
                .build();//构建
        //执行
        try {
            //接收执行后的返回
            response = okHttpClient.newCall(request).execute();
            System.out.println("headers："+response.headers());
            System.out.println("handshake："+response.handshake());
            return response.toString();

        } catch (IOException e) {
            e.printStackTrace();
            return "失败，fail";
        }
        //return response == null ? null : response.toString();
    }
    @Test
    public void testExecute(){
        System.out.println(myGetReq("https://api.golink.com/wx/auth"));
    }
}
