package com.tqz.pattern.prototype.core;

import java.io.Serializable;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/8 10:54
 */
public class Student implements Cloneable, Serializable {
    
    private String name;
    
    private String sex;
    
    private Integer age;
    
    public Student() {
    }
    
    public Student(String name, String sex, Integer age) {
        this.name = name;
        this.sex = sex;
        this.age = age;
    }
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public String getSex() {
        return sex;
    }
    
    public void setSex(String sex) {
        this.sex = sex;
    }
    
    public Integer getAge() {
        return age;
    }
    
    public void setAge(Integer age) {
        this.age = age;
    }
    
    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    @Override
    public String toString() {
        return "Student{" + "name='" + name + '\'' + ", sex='" + sex + '\'' + ", age=" + age + '}';
    }
}
