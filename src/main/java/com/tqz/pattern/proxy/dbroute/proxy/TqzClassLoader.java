package com.tqz.pattern.proxy.dbroute.proxy;

import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.FileInputStream;

/**
 * @Author: tian
 * @Date: 2020/4/19 23:27
 * @Desc: 类加载器
 */
public class TqzClassLoader extends ClassLoader {

    private File classPathFile;
    public TqzClassLoader(){
        String classPath = TqzClassLoader.class.getResource("").getPath();
        this.classPathFile = new File(classPath);
    }

    @Override
    protected Class<?> findClass(String name) throws ClassNotFoundException {
        try {
            String className = TqzClassLoader.class.getPackage().getName() + "." + name;
            if(classPathFile  != null){
                File classFile = new File(classPathFile,name.replaceAll("\\.","/") + ".class");
                if(classFile.exists()){
                    FileInputStream in = null;
                    ByteArrayOutputStream out = null;
                    try{
                        in = new FileInputStream(classFile);
                        out = new ByteArrayOutputStream();
                        byte [] buff = new byte[1024];
                        int len;
                        while ((len = in.read(buff)) != -1){
                            out.write(buff,0,len);
                        }
                        return defineClass(className,out.toByteArray(),0,out.size());
                    }catch (Exception e){
                        e.printStackTrace();
                    }
                }
            }
            return null;
        }catch (Exception e){
            e.printStackTrace();
            return null;

        }

    }
}
