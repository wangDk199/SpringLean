package com.soft1851.spring.dao.impl;

import com.soft1851.spring.dao.PostDao;
import com.soft1851.spring.entity.Post;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BatchPreparedStatementSetter;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

/**
 * @author ke
 * @ClassName PostImpl
 * @Description TOOD
 * @Date 2020/3/17
 * @Version 1.0
 **/
public class PostDaoImpl implements PostDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    @Override
    public int insert(Post post) {
        String sql = "INSERT INTO t_post VALUE(NULL,?)";
        Object[] args = {post.getPostName()};
        return jdbcTemplate.update(sql, args);
    }

    @Override
    public int[] batchInsert(List<Post> posts) {
        final List<Post> postList = posts;
        String sql = "INSERT INTO t_post VALUE(NULL, ?)";

        return jdbcTemplate.batchUpdate(sql, new BatchPreparedStatementSetter() {
            @Override
            public void setValues(PreparedStatement preparedStatement, int i) throws SQLException {
                preparedStatement.setString(1, postList.get(i).getPostName());
            }

            @Override
            public int getBatchSize() {
                return postList.size();
            }
        });
    }

    @Override
    public int delete(int postId) {
        String sql = "DELETE FROM t_post WHERE post_id = ?";
        Object[] args = {postId};

        return jdbcTemplate.update(sql, args);
    }

    @Override
    public int update(Post post) {
        String sql = "UPDATE t_post SET post_name = ? WHERE post_id = ?";
        Object[] args = {post.getPostName(), post.getPostId()};

        return jdbcTemplate.update(sql, args);
    }

    @Override
    public Post get(int postId) {
        String sql = "SELECT * FROM t_post WHERE post_id = ?";
        Object[] args = {postId};
        return jdbcTemplate.queryForObject(sql, args, new BeanPropertyRowMapper<>(Post.class));
    }

    @Override
    public List<Post> selectAll() {
        String sql = "SELECT * FROM t_post";

        return jdbcTemplate.query(sql, new BeanPropertyRowMapper<>(Post.class));
    }
}
