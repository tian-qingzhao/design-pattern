package com.tqz.pattern.builder;

/**
 * <p>抽象 build 类（接口）
 *
 * @author tianqingzhao
 * @since 2023/2/5 0:05
 */
public interface ComputerBuilder {
    
    Computer COMPUTER = new Computer();
    
    void buildMotherboard();
    
    void buildCpu();
    
    void buildMemory();
    
    void buildDisk();
    
    Computer build();
}
