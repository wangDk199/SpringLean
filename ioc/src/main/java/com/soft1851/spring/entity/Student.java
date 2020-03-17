package com.soft1851.spring.entity;

import java.util.List;

/**
 * @author ke
 * @ClassName Student
 * @Description TOOD
 * @Date 2020/3/17
 * @Version 1.0
 **/
public class Student {
    private String name;
    private List<Phone> phoneList;

    public Student(String name, List<Phone> phoneList) {
        this.name = name;
        this.phoneList = phoneList;
    }
    public Student() {

    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Phone> getPhoneList() {
        return phoneList;
    }

    public void setPhoneList(List<Phone> phoneList) {
        this.phoneList = phoneList;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", phoneList=" + phoneList +
                '}';
    }
}
