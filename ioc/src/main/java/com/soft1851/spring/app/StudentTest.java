package com.soft1851.spring.app;

import com.soft1851.spring.entity.Student;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * @author ke
 * @ClassName StudentTest
 * @Description TOOD
 * @Date 2020/3/17
 * @Version 1.0
 **/

public class StudentTest {
    public static void main(String[] args) {
        ApplicationContext ac = new ClassPathXmlApplicationContext("beans.xml");
        Student student = (Student) ac.getBean("student");
        System.out.println(student.toString());
    }
}
