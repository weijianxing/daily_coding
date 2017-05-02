package com.wjx.test.pattern.detail.builder;

/**
 * Created by hacke on 2017/4/24.
 *
 * Director 起封装作用，避免上层深入建造者业务实现
 */
public class Director {
    private Builder builder = new CurrentBuilder();

    public Product getProcut() {
        //设置不同的零件，构建不同的产品。
        builder.setPart();
        return builder.buildProduct();
    }
}
