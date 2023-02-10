package com.tqz.pattern.prototype.shallow;

import com.tqz.pattern.prototype.core.Student;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/8 10:59
 */
public class Clazz implements Cloneable {
    
    private String name;
    
    private Student student;
    
    public String getName() {
        return name;
    }
    
    public void setName(String name) {
        this.name = name;
    }
    
    public Student getStudent() {
        return student;
    }
    
    public void setStudent(Student student) {
        this.student = student;
    }
    
    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
    
    @Override
    public String toString() {
        return "Clazz{" + "name='" + name + '\'' + ", student=" + student + '}';
    }
}
