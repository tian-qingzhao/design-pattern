package com.tqz.pattern.state;

/**
 * <p>状态抽象类
 *
 * @author tianqingzhao
 * @since 2023/2/10 9:51
 */
public abstract class State {
    
    // 扣除积分 - 50
    public abstract void deductMoney();
    
    // 是否抽中奖品
    public abstract boolean raffle();
    
    // 发放奖品
    public abstract void dispensePrize();
    
}