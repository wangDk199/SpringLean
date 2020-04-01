package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Student;
import org.apache.ibatis.annotations.Param;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

/**
 * @author ke
 * @ClassName StudentMapper
 * @Description TOOD
 * @Date 2020/4/1
 * @Version 1.0
 **/
@Transactional(rollbackFor = Exception.class)
public interface StudentMapper {

    /**
     * 新增student，并返回自增主键
     *
     * @param student
     */
    void insert(Student student);

    /**
     * 根据studentId删除Student
     *
     * @param studentId
     */
    void delete(int studentId);

    /**
     * 更新Student
     *
     * @param student
     */
    void update(Student student);

    /**
     * 根据id查询Student
     *
     * @param studentId
     * @return Student
     */
    Student getStudentById(int studentId);

    /**
     * 查询所有学生，按生日排序,多对一关联查询学生所在班级信息
     *
     * @return List<Student>
     */
    List<Student> selectAll();

    /**
     * 批量插入
     *
     * @param students
     */
    void batchInsert(@Param("students") List<Student> students);

    /**
     * 批量删除
     *
     * @param idList
     */
    void batchDelete(@Param("idList") List<Integer> idList);

    /**
     * 批量更新
     *
     * @param students
     */
    void batchUpdate(@Param("students") List<Student> students);

    /**
     * 动态SQL查询
     *
     * @param student
     * @return List<Student>
     */
    List<Student> selectByDynamicSql(Student student);
}
