package com.soft1851.spring.web.spider;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.soft1851.spring.web.entity.Topic;
import org.apache.http.client.methods.CloseableHttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.client.protocol.HttpClientContext;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClients;
import org.apache.http.util.EntityUtils;
import org.apache.http.HttpEntity;

import java.io.IOException;
import java.net.http.HttpClient;
import java.util.ArrayList;
import java.util.List;

/**
 * @author ke
 * @ClassName JuejinSpider
 * @Description TOOD
 * @Date 2020/3/28
 * @Version 1.0
 **/
public class JuejinSpider {

    private static final Integer SUCCESS = 200;

    public static List<Topic> getTopic() {
        List<Topic> topicList = new ArrayList<>();
        String url = "https://short-msg-ms.juejin.im/v1/topicList?uid=5e7ef872f265da79987522ed&device_id=1585379442587&token=eyJhY2Nlc3NfdG9rZW4iOiJIM0QzdFFDUDRNeHRsUzRvIiwicmVmcmVzaF90b2tlbiI6ImtYNnM4WVR5QnlMOUVRQnoiLCJ0b2tlbl90eXBlIjoibWFjIiwiZXhwaXJlX2luIjoyNTkyMDAwfQ%3D%3D&src=web&sortType=hot&page=0&pageSize=100";
        CloseableHttpClient httpClient = HttpClients.createDefault();
        HttpGet get = new HttpGet(url);

        HttpClientContext context = HttpClientContext.create();
        CloseableHttpResponse response = null;
        try {
            response = httpClient.execute(get, context);
        } catch (IOException e) {
            e.printStackTrace();
        }
        assert response != null;
        if (response.getStatusLine().getStatusCode() == SUCCESS) {
            HttpEntity entity = (HttpEntity) response.getEntity();
            String res = null;
            try {
                res = EntityUtils.toString(entity, "UTF-8");

            } catch (IOException e) {
                e.printStackTrace();
            }


            JSONObject jsonObject = JSONObject.parseObject(res);
            JSONArray list = jsonObject.getJSONObject("d").getJSONArray("list");
            list.forEach(o -> {
                JSONObject json = JSONObject.parseObject(o.toString());
                Topic topic = Topic.builder()
                        .id(json.getString("objectId"))
                        .topicName(json.getString("title"))
                        .topicIcon(json.getString("icon"))
                        .description(json.getString("description"))
                        .msgCount(json.getInteger("msgsCount"))
                        .followersCount(json.getInteger("followersCount"))
                        .followed(json.getBoolean("followed")).build();
                System.out.println(topic);
                topicList.add(topic);
            });
        } else {
            System.out.println("请求失败" + response.getStatusLine());
        }
        try {
            response.close();
            httpClient.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
        return topicList;
    }

    public static void main(String[] args) {
        getTopic();
    }
}