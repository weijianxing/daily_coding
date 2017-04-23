package com.wjx.test.pattern.detail.factory;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

/**
 * Created by hacke on 2017/4/23.
 */
public class SingletonFactory {
    private static Singleton singleton;

    static {
        try {
            Class c = Class.forName(Singleton.class.getName());
            try {
                Constructor constructor = c.getDeclaredConstructor();
                constructor.setAccessible(true);
                try {
                    singleton = (Singleton)constructor.newInstance();
                } catch (InstantiationException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                } catch (InvocationTargetException e) {
                    e.printStackTrace();
                }
            } catch (NoSuchMethodException e) {
                e.printStackTrace();
            }
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
    }


    public static Singleton getSingleton(){
        return singleton;
    }
}
