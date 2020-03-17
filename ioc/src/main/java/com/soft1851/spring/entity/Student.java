package com.soft851.spring;

import com.soft851.spring.Phone;

/**
 * @author xunmi
 * @ClassName Student
 * @Description TODO
 * @Date 2020/3/12
 * @Version 1.0
 **/
public class Student {
    private String name;
    private Phone phone;

    public Student() {
    }

    public Student(String name, Phone phone) {
        this.name = name;
        this.phone = phone;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Phone getPhone() {
        return phone;
    }

    public void setPhone(Phone phone) {
        this.phone = phone;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phone=" + phone +
                '}';
    }
}
