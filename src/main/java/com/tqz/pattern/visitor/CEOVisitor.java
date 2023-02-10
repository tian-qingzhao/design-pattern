package com.tqz.pattern.visitor;

/**
 * <p>CEO，具体元素，访问者
 *
 * @author tianqingzhao
 * @since 2023/2/10 9:36
 */
public class CEOVisitor implements Visitor {
    
    @Override
    public void visit(Engineer engineer) {
        System.out.println("工程师：" + engineer.getName() + "KPI:" + engineer.getKpi());
    }
    
    @Override
    public void visit(Manager manager) {
        System.out.println(
                "经理：" + manager.getName() + "KPI:" + manager.getKpi() + " 今年共完成项目：" + manager.getProductNum() + "个");
    }
}