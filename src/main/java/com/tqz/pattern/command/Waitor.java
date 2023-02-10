package com.tqz.pattern.command;

import java.util.ArrayList;
import java.util.List;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/5 0:37
 */
public class Waitor {
    
    private final List<Command> commandList;
    
    public Waitor() {
        this.commandList = new ArrayList<>();
    }
    
    public void addCommand(Command command) {
        commandList.add(command);
    }
    
    public void orderUp() {
        System.out.println("来订单了");
        
        for (Command command : commandList) {
            command.executor();
        }
    }
}
