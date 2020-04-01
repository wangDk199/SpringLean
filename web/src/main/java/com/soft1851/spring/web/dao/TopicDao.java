package com.soft1851.spring.web.dao;

import com.soft1851.spring.web.entity.Topic;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author ke
 * @ClassName TopicDao
 * @Description TOOD
 * @Date 2020/3/26
 * @Version 1.0
 **/

public interface TopicDao {

    List<Topic> selectAll();

    /**
     * 批量插入
     * @param topics
     * @return int[]
     */
    int[] batchInsert(List<Topic> topics);

    /**
     * 新增一个
     * @param topic
     * @return int
     */
    int insert(Topic topic);
}
