package com.soft1851.spring.dao;

import com.soft1851.spring.entity.Forum;

import java.util.List;

/**
 * @author ke
 * @ClassName ForumDao
 * @Description TOOD
 * @Date 2020/3/17
 * @Version 1.0
 **/
public interface ForumDao {
    /**
     * 新增
     */
    int insert(Forum forum);

    /**
     * 批量增加
     */
    int[] batchInsert(List<Forum> forums);

    /**
     * 根据id删除
     */
    int delete(int forumId);

    /**
     * 修改forum
     */
    int update(Forum forum);

    /**
     * 根据id查找
     *
     */
    Forum get(int forumId);

    List<Forum> selectAll();
}
