package com.tqz.pattern.builder;

/**
 * <p>电脑对象
 *
 * @author tianqingzhao
 * @since 2023/2/5 0:05
 */
public class Computer {
    
    private String motherboard;
    
    private String cpu;
    
    private String memory;
    
    private String disk;
    
    public String getMotherboard() {
        return motherboard;
    }
    
    public void setMotherboard(String motherboard) {
        this.motherboard = motherboard;
    }
    
    public String getCpu() {
        return cpu;
    }
    
    public void setCpu(String cpu) {
        this.cpu = cpu;
    }
    
    public String getMemory() {
        return memory;
    }
    
    public void setMemory(String memory) {
        this.memory = memory;
    }
    
    public String getDisk() {
        return disk;
    }
    
    public void setDisk(String disk) {
        this.disk = disk;
    }
    
    @Override
    public String toString() {
        return "Computer{" + "motherboard='" + motherboard + '\'' + ", cpu='" + cpu + '\'' + ", memory='" + memory
                + '\'' + ", disk='" + disk + '\'' + '}';
    }
}
