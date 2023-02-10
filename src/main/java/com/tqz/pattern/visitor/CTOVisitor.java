package com.tqz.pattern.visitor;

/**
 * <p>CTO，具体元素，访问者
 *
 * @author tianqingzhao
 * @since 2023/2/10 9:37
 */
public class CTOVisitor implements Visitor {
    
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.getName() + " 今年代码量" + engineer.getCodeLineTotal() + "行");
    }
    
    @Override
    public void visit(Manager manager) {
        System.out.println("经理：" + manager.getName() + " 今年共完成项目：" + manager.getProductNum() + "个");
    }
}