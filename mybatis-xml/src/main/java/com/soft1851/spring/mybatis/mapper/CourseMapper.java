package com.soft1851.spring.mybatis.mapper;

import com.soft1851.spring.mybatis.entity.Course;

/**
 * @author ke
 * @ClassName CourseMapper
 * @Description TOOD
 * @Date 2020/4/1
 * @Version 1.0
 **/
public interface CourseMapper {
    /**
     * 根据班课id查询班课详情(班课自身信息、学生列表)
     * @param courseId
     * @return
     */
    Course getCourseById(int courseId);
}
