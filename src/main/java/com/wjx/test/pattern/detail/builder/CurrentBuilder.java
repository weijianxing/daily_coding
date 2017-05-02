package com.wjx.test.pattern.detail.builder;

/**
 * Created by hacke on 2017/4/24.
 */
public class CurrentBuilder extends Builder {
    private Product product = new Product();
    @Override
    public void setPart() {
        //product BL process.
    }

    @Override
    public Product buildProduct() {
        return product;
    }
}
