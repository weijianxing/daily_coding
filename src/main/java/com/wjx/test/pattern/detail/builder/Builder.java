package com.wjx.test.pattern.detail.builder;

/**
 * Created by hacke on 2017/4/24.
 */
public abstract class Builder {
    //set different of product then .
    public abstract void setPart();
    public abstract Product buildProduct();
}
