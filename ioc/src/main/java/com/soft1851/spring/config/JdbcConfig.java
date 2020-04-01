package com.soft1851.spring.config;

import com.alibaba.druid.pool.DruidDataSource;
import com.soft1851.spring.dao.ForumDao;
import com.soft1851.spring.dao.impl.ForumDaoImpl;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.jdbc.core.JdbcTemplate;

/**
 * @author ke
 * @ClassName JdbcConfig
 * @Description TOOD
 * @Date 2020/3/19
 * @Version 1.0
 **/
@Configuration
@ComponentScan("com.soft1851.spring")
public class JdbcConfig {

    @Bean
    public DruidDataSource dataSource() {
        DruidDataSource druidDataSource = new DruidDataSource();
        druidDataSource.setDriverClassName("com.mysql.jdbc.Driver");
        druidDataSource.setUrl("jdbc:mysql://localhost:3306/bbs?useUnicode=true&characterEncoding=utf8&useSSL=false");
        druidDataSource.setUsername("root");
        druidDataSource.setPassword("root");
        druidDataSource.setInitialSize(8);
        return druidDataSource;
    }

    @Bean
    public JdbcTemplate jdbcTemplate() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate();
        jdbcTemplate.setDataSource(dataSource());
        return jdbcTemplate;
    }

    @Bean
    public ForumDao forumDao (JdbcTemplate jdbcTemplate) {
        return new ForumDaoImpl(jdbcTemplate);
    }

    public static void main(String[] args) {
        AnnotationConfigApplicationContext aca = new AnnotationConfigApplicationContext(JdbcConfig.class);
        DruidDataSource dataSource = (DruidDataSource) aca.getBean("dataSource");
        System.out.println(dataSource);

        JdbcTemplate jdbcTemplate = (JdbcTemplate) aca.getBean("jdbcTemplate");
        System.out.println(jdbcTemplate);
    }
}
