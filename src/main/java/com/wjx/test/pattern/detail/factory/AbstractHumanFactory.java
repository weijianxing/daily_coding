package com.wjx.test.pattern.detail.factory;

/**
 * Created by hacke on 2017/4/23.
 */
public abstract class AbstractHumanFactory {
    public abstract <T extends Human> T createHuman(Class<T> c) throws ClassCastException;
}
