package com.tqz.pattern.builder;

/**
 * <p>构建华硕电脑对象
 *
 * @author tianqingzhao
 * @since 2023/2/5 0:08
 */
public class AsusComputerBuilder implements ComputerBuilder {
    
    @Override
    public void buildMotherboard() {
        COMPUTER.setMotherboard("Extreme主板");
    }
    
    @Override
    public void buildCpu() {
        COMPUTER.setCpu("Inter i9-9700k");
    }
    
    @Override
    public void buildMemory() {
        COMPUTER.setMemory("金士顿 16*2");
    }
    
    @Override
    public void buildDisk() {
        COMPUTER.setDisk("三星980Pro 2T");
    }
    
    @Override
    public Computer build() {
        return COMPUTER;
    }
}
