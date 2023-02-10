package com.tqz.pattern.composite;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/4 20:28
 */
public class TestMenu {
    
    public static void main(String[] args) {
        Menu menu1 = new CompositeMenu("系统管理", 1);
    
        Menu menu2 = new CompositeMenu("用户管理", 2);
        menu2.add(new MenuItem("查询用户", 3));
        menu2.add(new MenuItem("添加用户", 3));
        menu2.add(new MenuItem("修改用户", 3));
        menu2.add(new MenuItem("删除用户", 3));
    
        Menu menu3 = new CompositeMenu("角色管理", 2);
        menu3.add(new MenuItem("查询角色", 3));
        menu3.add(new MenuItem("添加角色", 3));
        menu3.add(new MenuItem("修改角色", 3));
        menu3.add(new MenuItem("删除角色", 3));
        
        menu1.add(menu2);
        menu1.add(menu3);
        
        menu1.print();
    }
    
}
