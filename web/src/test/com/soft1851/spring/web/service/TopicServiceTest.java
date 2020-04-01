package com.soft1851.spring.web.service;

import com.soft1851.spring.web.entity.Topic;
import com.soft1851.spring.web.spider.JuejinSpider;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.*;

public class TopicServiceTest {

    private TopicService topicService;

    @Test
    public void addTopic() {
        List<Topic> topicList = new ArrayList<>();
        Topic topic = Topic.builder()
                .id("15665")
                .topicName("sasas")
                .topicIcon("slks.png")
                .description("kdjklmscksmlckscsml")
                .msgCount(154)
                .followersCount(1565)
                .followed(true).build();
        topicList.add(topic);
    }

    @Test
    public void batchInsert() {
        int[] ints = topicService.batchInsert(JuejinSpider.getTopic());
        assertEquals(JuejinSpider.getTopic().size(), ints.length);
    }

    @Test
    public void queryAll() {
        List<Topic> topics = topicService.queryAll();
        assertEquals(3, topics.size());
    }
}