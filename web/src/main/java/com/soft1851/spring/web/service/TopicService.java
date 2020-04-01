package com.soft1851.spring.web.service;

import com.soft1851.spring.web.entity.Topic;

import java.util.List;

/**
 * @author ke
 * @ClassName TopicService
 * @Description TOOD
 * @Date 2020/3/28
 * @Version 1.0
 **/
public interface TopicService {
    List<Topic> queryAll();

    void addTopic(Topic topic);

    int[] batchInsert(List<Topic> topics);
}
