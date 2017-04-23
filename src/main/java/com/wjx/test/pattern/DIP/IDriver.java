package com.wjx.test.pattern.DIP;

/**
 * Created by hacke on 2017/4/23.
 *
 * Best practice.
 * 1.每个类尽量有接口或抽象类。
 * 2.变量的表面类型尽量是接口或抽象类。
 */
public interface IDriver {
    public void setCar(ICar icar);
    public void drive();
}
