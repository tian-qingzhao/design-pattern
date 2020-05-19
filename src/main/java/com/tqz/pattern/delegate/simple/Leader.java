package com.tqz.pattern.delegate.simple;

import java.util.HashMap;
import java.util.Map;

/**
 * @Author: tian
 * @Date: 2020/4/21 21:46
 * @Desc: 领导在分配给员工
 */
public class Leader {

    private Map<String,Employee> register = new HashMap<String,Employee>();

    public Leader(){
        register.put("前端",new EmployeeA());
        register.put("后台",new EmployeeB());
    }

    public void doing(String command){
        register.get(command).doing(command);
    }
}
