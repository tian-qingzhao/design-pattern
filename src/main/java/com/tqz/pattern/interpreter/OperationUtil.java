package com.tqz.pattern.interpreter;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/7 8:36
 */
public class OperationUtil {
    
    public static boolean isOperator(String element) {
        return "+".equals(element) || "-".equals(element) || "*".equals(element) || "/".equals(element);
    }
    
    public static Expression getNonTerminal(Expression left, Expression right, String element) {
        if ("+".equals(element)) {
            return new AddNonTerminal(left, right);
        } else if ("-".equals(element)) {
            return new ReduceNonTerminal(left, right);
        } else if ("*".equals(element)) {
            return new MclNonTerminal(left, right);
        } else if ("/".equals(element)) {
            return new DivisionNonTerminal(left, right);
        }
        
        return null;
    }
}
