package com.soft1851.spring.dao;

import com.soft1851.spring.entity.Post;

import java.util.List;

/**
 * @author ke
 * @ClassName Post
 * @Description TOOD
 * @Date 2020/3/17
 * @Version 1.0
 **/
public interface PostDao {
    /**
     * 新增
     */
    int insert(Post post);

    /**
     * 批量增加
     */
    int[] batchInsert(List<Post> posts);

    /**
     * 根据id删除
     */
    int delete(int postId);

    /**
     * 修改forum
     */
    int update(Post post);

    /**
     * 根据id查找
     *
     */
    Post get(int postId);

    List<Post> selectAll();
}
