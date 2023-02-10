package com.tqz.pattern.prototype.deep;

import com.tqz.pattern.prototype.core.Student;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/8 11:11
 */
public class TestDeepClone {
    
    public static void main(String[] args) throws Exception {
        Clazz clazz1 = new Clazz();
        clazz1.setName("高三一班");
        Student stu1 = new Student("张三", "男", 18);
        clazz1.setStudent(stu1);
        Clazz clazz3 = (Clazz) clazz1.deepClone();
        Student stu3 = clazz3.getStudent();
        stu3.setName("王五");
        System.out.println(clazz1); // Clazz(name=高三一班, student=Student(name=张三, sex=男, age=18))
        System.out.println(clazz3); // Clazz(name=高三一班, student=Student(name=王五, sex=男, age=18))
        
        // 可以看到，当修改了stu3的姓名时，stu1的姓名并没有被修改了，这说明stu3和stu1已经是不同的对象了，
        // 说明Clazz中的Student也被克隆了，不再指向原有对象地址，这就是深克隆。这里需要注意的是，
        // Clazz类和Student类都需要实现Serializable接口，否则会抛出NotSerializableException异常。
    }
    
}
