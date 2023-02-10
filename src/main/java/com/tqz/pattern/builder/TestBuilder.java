package com.tqz.pattern.builder;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/5 0:11
 */
public class TestBuilder {
    
    public static void main(String[] args) {
        AsusComputerBuilder builder = new AsusComputerBuilder();
        ComputerDirector director = new ComputerDirector(builder);
        System.out.println(director.construct());
        
        SimpleComputerBuilder simpleComputerBuilder = new SimpleComputerBuilder();
        Computer computer = simpleComputerBuilder.buildMethorboard("Extreme主板").buildCpu("Inter i9-9700k")
                .buildMemory("金士顿 16*2").buildDisk("三星980Pro 2T").build();
        System.out.println(computer);
    }
    
}
