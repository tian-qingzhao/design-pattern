package com.tqz.pattern.prototype.shallow;

import com.tqz.pattern.prototype.core.Student;

/**
 * <p>浅克隆测试案例
 *
 * @author tianqingzhao
 * @since 2023/2/8 11:01
 */
public class TestShallowClone {
    
    public static void main(String[] args) throws CloneNotSupportedException {
        Clazz clazz1 = new Clazz();
        clazz1.setName("一班");
        Student student1 = new Student("zhangsan", "男", 20);
        clazz1.setStudent(student1);
        // Clazz{name='一班', student=Student{name='zhangsan', sex='男', age=20}}
        System.out.println(clazz1);
        
        Clazz clazz2 = (Clazz) clazz1.clone();
        Student student2 = clazz2.getStudent();
        student2.setName("lisi");
        // Clazz{name='一班', student=Student{name='lisi', sex='男', age=20}}
        System.out.println(clazz1);
        // Clazz{name='一班', student=Student{name='lisi', sex='男', age=20}}
        System.out.println(clazz2);
        
        // 可以看到，当修改了stu2的姓名时，stu1的姓名同样也被修改了，这说明stu1和stu2是同一个对象，
        // 这就是浅克隆的特点，对具体原型类中的引用类型的属性进行引用的复制。
        // 同时，这也可能是浅克隆所带来的弊端，因为结合该例子的原意，
        // 显然是想在班级中新增一名叫李四的学生，而非让所有的学生都改名叫李四，于是我们这里就要使用深克隆。
    }
    
}
