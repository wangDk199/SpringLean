package com.soft1851.spring.dao;

import com.soft1851.spring.dao.impl.PostDaoImpl;
import com.soft1851.spring.entity.Post;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertNotNull;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = {"/applicationContext.xml"})
public class PostDaoTest {
    @Autowired
    private PostDao postDao;
    @Test
    public void insert() {
        Post post = Post.builder().postName("测试").build();
        int count = postDao.insert(post);
        System.out.println(count);
    }

    @Test
    public void batchInsert() {
        Post[] posts = {Post.builder().postName("nkjdsnkc").build(),
                Post.builder().postName("dsjcn").build(),
                Post.builder().postName("dcnjdc").build()
        };
        List<Post> forumList = Arrays.asList(posts);
        int[] rows = postDao.batchInsert(forumList);
        assertEquals(3,rows.length);
    }

    @Test
    public void delete() {
        int n = postDao.delete(2);
        assertEquals(1,n);
    }

    @Test
    public void update() {
        Post forum = postDao.getId(3);
        forum.setPostName("修改论坛测试的新名称");
        int n = postDao.update(forum);
        assertEquals(1,n);
    }

    @Test
    public void getId() {
        Post post = postDao.getId(5);
        assertNotNull(post);
    }
    @Test
    public void getName() {
        Post post = postDao.getName("修");
        assertNotNull(post);
    }

}