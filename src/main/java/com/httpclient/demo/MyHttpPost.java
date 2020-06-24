package com.httpclient.demo;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONObject;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.ClientProtocolException;
import org.apache.http.client.CookieStore;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.entity.StringEntity;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.message.BasicNameValuePair;
import org.apache.http.util.EntityUtils;
import org.testng.annotations.Test;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class MyHttpPost {
    private String url = "http://www.ceair.com/booking/new-low-price-calendar!getDynDayLowPriceEc.shtml";
    private String dataTime;
    private CookieStore store;
    private String cookie = "Webtrends=2b74f2c3.595d278770acc; language=zh_CN; gr_user_id=d7ce0b3e-6a56-4765-ba1d-02fddbd2568c; ecrmWebtrends=140.206.248.108.1572106081013; grwng_uid=f625da66-9e2b-475d-9601-936e0aeef48f; JSESSIONID=aptRUsjTMFmFf3UrnQYnSaL7.laputaServer8; 84bb15efa4e13721_gr_session_id=d202b40f-b414-48b8-9791-3cc7338cf1d8; 84bb15efa4e13721_gr_session_id_d202b40f-b414-48b8-9791-3cc7338cf1d8=true";
    @Test
    public void DongFangFlight() {
        System.out.println("执行开始");
        //声明一个client对象，用来方法执行
        DefaultHttpClient client = new DefaultHttpClient();

        //声明一个post方法
        HttpPost post = new HttpPost(url);

        //添加参数
        JSONObject param = new JSONObject();
        //JSONObject param = JSON.parseObject(dataJson);
        param.put("cond.monthOffSet","0");
        param.fluentPut("cond.depCode","SHA");
        param.fluentPut("cond.arrCode","HNY");
        param.fluentPut("cond.depCityCode","SHA");
        param.fluentPut("cond.arrCityCode","HNY");
        param.fluentPut("cond.arrAirport","HNY");
        param.fluentPut("cond.trip","OW");
        param.fluentPut("cond.depDate","2019-10-31");
        param.fluentPut("cond.currency","CNY");


        System.out.println("请求参数："+param);

        //设置请求头信息
        post.setHeader("content-type", "application/x-www-form-urlencoded");
        post.setHeader("Cookie",cookie);

        //设置请求参数
        StringEntity entity = null;
        entity = new StringEntity(param.toString(), "utf-8");
        post.setEntity(entity);

        //声明一个对象进行响应结果的存储

        //设置cookies信息
        client.setCookieStore(store);

        //执行post方法
        HttpResponse response = null;
        try {
            response = client.execute(post);
        } catch (IOException e) {
            e.printStackTrace();
        }

        //获取响应结果
        String result = null;
        try {
            result = EntityUtils.toString(response.getEntity(),"utf-8");
        } catch (IOException e) {
            e.printStackTrace();
        }
        System.out.println(result);
        System.out.println(response.getStatusLine().getStatusCode());
        System.out.println("执行结束");
    }

    @Test
    public void DongFangFlight2(){
        // 创建Httpclient对象
        DefaultHttpClient httpclient = new DefaultHttpClient();
        // 创建http POST请求
        HttpPost httpPost = new HttpPost(url);


        // 设置2个post参数，一个是scope、一个是q
        List<NameValuePair> parameters = new ArrayList<NameValuePair>(0);
        parameters.add(new BasicNameValuePair("cond.monthOffSet", "0"));
        parameters.add(new BasicNameValuePair("cond.depCode", "SHA"));
        parameters.add(new BasicNameValuePair("cond.arrCode", "HNY"));
        parameters.add(new BasicNameValuePair("cond.depCityCode", "SHA"));
        parameters.add(new BasicNameValuePair("cond.arrCityCode", "HNY"));
        parameters.add(new BasicNameValuePair("cond.arrAirport", "HNY"));
        parameters.add(new BasicNameValuePair("cond.trip","OW"));
        parameters.add(new BasicNameValuePair("cond.depDate","2019-10-31"));
        parameters.add(new BasicNameValuePair("cond.currency","CNY"));

        // 构造一个form表单式的实体
        UrlEncodedFormEntity formEntity = null;
        try {
            formEntity = new UrlEncodedFormEntity(parameters);
        } catch (UnsupportedEncodingException e) {
            e.printStackTrace();
        }
        System.out.println("请求参数："+parameters);
        // 将请求实体设置到httpPost对象中
        httpPost.setEntity(formEntity);
        //伪装浏览器
        httpPost.setHeader("User-Agent","Mozilla/5.0 (Windows NT 6.1; Win64; x64) AppleWebKit/537.36 (KHTML, like Gecko) Chrome/56.0.2924.87 Safari/537.36");
        httpPost.setHeader("Cookie",cookie);
        httpPost.setHeader("content-type", "application/x-www-form-urlencoded");
        HttpResponse response = null;
        try {
            // 执行请求
            response = httpclient.execute(httpPost);
            // 判断返回状态是否为200
            if (response.getStatusLine().getStatusCode() == 200) {
                String content = EntityUtils.toString(response.getEntity(), "UTF-8");
                System.out.println(content);
                //System.out.println("内容长度："+content.length());
            }
        } catch (ClientProtocolException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    }

