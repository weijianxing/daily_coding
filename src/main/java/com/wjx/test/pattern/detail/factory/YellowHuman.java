package com.wjx.test.pattern.detail.factory;

/**
 * Created by hacke on 2017/4/23.
 */
public class YellowHuman implements Human {
    public String getColor() {
        return "yellow";
    }

    public String talk() {
        return "i'm a chinese.";
    }
}
