package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Teacher;

/**
 * @author ke
 * @ClassName TeacherMapper
 * @Description TOOD
 * @Date 2020/4/1
 * @Version 1.0
 **/
public interface TeacherMapper {

    /**
     * 根据teacherId一对一关联查询其管理的班级信息
     * @param teacherId
     * @return
     */
    Teacher getTeacherOneToOne(int teacherId);
}
