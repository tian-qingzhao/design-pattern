package com.tqz.pattern.builder;

/**
 * <p>指挥者类，指挥组装什么电脑
 *
 * @author tianqingzhao
 * @since 2023/2/5 0:10
 */
public class ComputerDirector {
    
    private ComputerBuilder computerBuilder;
    
    public ComputerDirector(ComputerBuilder computerBuilder) {
        this.computerBuilder = computerBuilder;
    }
    
    public Computer construct() {
        computerBuilder.buildMotherboard();
        computerBuilder.buildCpu();
        computerBuilder.buildMemory();
        computerBuilder.buildDisk();
        return computerBuilder.build();
    }
}
