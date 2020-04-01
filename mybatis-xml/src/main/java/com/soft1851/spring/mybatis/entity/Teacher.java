package com.soft1851.spring.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @author ke
 * @ClassName Teacher
 * @Description TOOD
 * @Date 2020/4/1
 * @Version 1.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class Teacher {
    /**
     * 教师id
     */
    private Integer teacherId;
    /**
     * 教师姓名
     */
    private String teacherName;
    /**
     * 教师管理的班级id
     */
    private Integer clazzId;
    /**
     * 一对一映射关系
     */
    private Clazz clazz;
}
