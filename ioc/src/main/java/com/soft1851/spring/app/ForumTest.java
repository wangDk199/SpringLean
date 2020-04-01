package com.soft1851.spring.app;

import com.soft1851.spring.config.JdbcConfig;
import com.soft1851.spring.entity.Forum;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.util.List;

/**
 * @author ke
 * @ClassName ForumTest
 * @Description TOOD
 * @Date 2020/3/19
 * @Version 1.0
 **/

public class ForumTest {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext anc = new AnnotationConfigApplicationContext(JdbcConfig.class);
        anc.scan("com.soft1851.spring.config");
        JdbcTemplate jdbcTemplate = (JdbcTemplate) anc.getBean("jdbcTemplate");
        System.out.println(jdbcTemplate);
        String sql = "SELECT * FROM t_forum";
        List<Forum> forumList = jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Forum.class));
        System.out.println(forumList);
    }

}
