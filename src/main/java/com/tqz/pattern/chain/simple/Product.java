package com.tqz.pattern.chain.simple;

/**
 * <p>
 *
 * @author tianqingzhao
 * @since 2023/2/7 9:21
 */
public class Product {
    
    private int height;
    
    private int weight;
    
    public Product(int height, int weight) {
        this.height = height;
        this.weight = weight;
    }
    
    public int getHeight() {
        return height;
    }
    
    public void setHeight(int height) {
        this.height = height;
    }
    
    public int getWeight() {
        return weight;
    }
    
    public void setWeight(int weight) {
        this.weight = weight;
    }
}
