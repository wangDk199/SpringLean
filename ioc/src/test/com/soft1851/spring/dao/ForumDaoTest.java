package com.soft1851.spring.dao;

import com.soft1851.spring.config.JdbcConfig;
import com.soft1851.spring.dao.impl.ForumDaoImpl;
import com.soft1851.spring.entity.Forum;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;
@RunWith(SpringJUnit4ClassRunner.class)
//@ContextConfiguration(locations = {"/applicationContext.xml"})
@ContextConfiguration(classes = {JdbcConfig.class})
public class ForumDaoTest {

    @Autowired
    private ForumDao forumDao;
    @Test
    public void insert() {
        Forum forum = Forum.builder().forumName("测试").build();
        int count = forumDao.insert(forum);
        System.out.println(count);
    }

    @Test
    public void batchInsert() {
        Forum[] forums = {Forum.builder().forumName("nkjdsnkc").build(),
                Forum.builder().forumName("dsjcn").build(),
                Forum.builder().forumName("dcnjdc").build()
        };
        List<Forum> forumList = Arrays.asList(forums);
        int[] rows = forumDao.batchInsert(forumList);
        assertEquals(3,rows.length);
    }

    @Test
    public void delete() {
        int n = forumDao.delete(4);
        assertEquals(1,n);
    }

    @Test
    public void update() {
        Forum forum = forumDao.get(6);
        forum.setForumName("修改论坛测试的新名称");
        int n = forumDao.update(forum);
        assertEquals(1,n);
    }

    @Test
    public void get() {
        Forum forum = forumDao.get(6);
        assertNotNull(forum);
    }

    @Test
    public void selectAll() {
        List<Forum> forums = forumDao.selectAll();
        assertEquals(14,forums.size());
    }
}