package com.tqz.pattern.interpreter;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/7 8:34
 */
public class Cal {
    
    private Expression left;
    
    private Expression right;
    
    private Integer result;
    
    public Cal(String expression) {
        parse(expression);
    }
    
    private void parse(String expression) {
        String[] elements = expression.split(" ");
        
        for (int i = 0; i < elements.length; i++) {
            String element = elements[i];
            
            if (OperationUtil.isOperator(element)) {
                right = new NumberTerminal(Integer.parseInt(elements[++i]));
                
                result = OperationUtil.getNonTerminal(left, right, element).interpret();
                
                left = new NumberTerminal(result);
            } else {
                left = new NumberTerminal(Integer.parseInt(element));
            }
        }
    }
    
    public Integer call() {
        return result;
    }
}
