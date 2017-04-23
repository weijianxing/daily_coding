package com.wjx.test.pattern.detail;

/**
 * Created by hacke on 2017/4/23.
 * 单例长时间不使用需要考虑jvm回收问题解决此问题需要考虑使用容器管理单例的生命周期或者状态随时记录。
 */
public class SingletonTest {
    private static SingletonTest singleton = null;
    private SingletonTest(){}

    //muiti thread may generate muiti instances.
    public static SingletonTest getSingleton(){
        if(singleton == null){
            singleton = new SingletonTest();
        }
        return singleton;
    }
}
