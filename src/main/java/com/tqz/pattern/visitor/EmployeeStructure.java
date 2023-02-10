package com.tqz.pattern.visitor;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/10 9:39
 */
public class EmployeeStructure {
    
    private List<Employee> list = new ArrayList<>();
    
    public EmployeeStructure addEmployee(Employee employee) {
        list.add(employee);
        return this;
    }
    
    public void report(Visitor visitor) {
        list.forEach(employee -> employee.accept(visitor));
    }
}
