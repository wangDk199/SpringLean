package com.soft1851.spring.mybatis.entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.time.LocalDate;
import java.util.List;

/**
 * @author ke
 * @ClassName Student
 * @Description TOOD
 * @Date 2020/4/1
 * @Version 1.0
 **/
@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Student {
    private  Integer studentId;
    private Integer clazzId;
    private String studentName;
    private String hometown;
    private LocalDate birthday;
    private Clazz clazz;
    private List<Course> courses;
}
