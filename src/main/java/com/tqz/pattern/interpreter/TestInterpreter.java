package com.tqz.pattern.interpreter;

import org.springframework.expression.Expression;
import org.springframework.expression.spel.standard.SpelExpressionParser;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/7 8:42
 */
public class TestInterpreter {
    
    public static void main(String[] args) {
        Cal cal = new Cal("10 + 20 / 10 * 5");
        System.out.println(cal.call());
        
        // Spring 中解释器案例
        SpelExpressionParser parser = new SpelExpressionParser();
        Expression expression = parser.parseExpression("(10 + 30) / 10");
        System.out.println(expression.getValue());
    }
}
