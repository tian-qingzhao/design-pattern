package com.tqz.pattern.prototype.simple;

import com.tqz.pattern.prototype.core.Student;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/8 10:53
 */
public class TestSimpleClone {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        Student student1 = new Student();
        student1.setName("zhangsan");
        student1.setSex("男");
        student1.setAge(20);
        
        Student student2 = (Student) student1.clone();
        student2.setName("lisi");
    
        System.out.println(student1);
        System.out.println(student2);
        
    }
    
}
