package com.soft1851.spring.mybatis.entity;

import lombok.*;

/**
 * @author ke
 * @ClassName CourseStudent
 * @Description TOOD
 * @Date 2020/4/1
 * @Version 1.0
 **/
@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class CourseStudent {
    private Integer id;
    private Integer courseId;
    private Integer studentId;
}
