package com.tqz.pattern.factory.simplefactory;

/**
 * @Author: tian
 * @Date: 2020/4/5 16:12
 * @Desc:
 */
public class CourseFactory {

//    public ICourse createCourse(String name){
//        if("Java".equals(name)){
//            return new JavaCourse();
//        }else {
//            return null;
//        }
//    }
    
//    public ICourse createCourse(String className){
//        try {
//            return (ICourse) Class.forName(className).newInstance();
//        }catch (Exception e){
//            e.printStackTrace();
//            return null;
//        }
//    }

    public ICourse createCourse(Class clazz){
        try {
            return (ICourse) clazz.newInstance();
        }catch (Exception e){
            e.printStackTrace();
            return null;
        }
    }
}
