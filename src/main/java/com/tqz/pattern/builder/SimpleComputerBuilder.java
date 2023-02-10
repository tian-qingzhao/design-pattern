package com.tqz.pattern.builder;

/**
 * 简化写法。
 *
 * <p>虽然简化了系统结构，但是加重了构建者类的职责，也不符合单一职责原则。 如果 construct() 过于负责，建议还是封装到 Director 中。
 *
 * @author tianqingzhao
 * @since 2023/2/5 0:12
 */
public class SimpleComputerBuilder {
    
    private final Computer computer = new Computer();
    
    public SimpleComputerBuilder buildMethorboard(String methorboard) {
        computer.setMotherboard(methorboard);
        return this;
    }
    
    public SimpleComputerBuilder buildCpu(String cpu) {
        computer.setCpu(cpu);
        return this;
    }
    
    public SimpleComputerBuilder buildMemory(String memory) {
        computer.setMemory(memory);
        return this;
    }
    
    public SimpleComputerBuilder buildDisk(String disk) {
        computer.setDisk(disk);
        return this;
    }
    
    public Computer build() {
        return computer;
    }
}
