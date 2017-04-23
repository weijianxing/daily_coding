package com.wjx.test.pattern.detail.factory;

/**
 * Created by hacke on 2017/4/23.
 */
public class Test {
    public static void main(String[] args) {
//        AbstractHumanFactory abstractHumanFactory = new HumanFactory();
//        Human human = abstractHumanFactory.createHuman(YellowHuman.class);
//        System.out.println(human.getColor());
//        System.out.println(human.talk());
//        SingletonFactory singletonFactory = new SingletonFactory();
        Singleton singleton = SingletonFactory.getSingleton();
        singleton.doSth();
    }

}
