package com.wjx.test.pattern.detail.proxy;

/**
 * Created by hacke on 2017/4/24.
 */
public class Proxy implements Subject {
    private Subject subject = null;

    public Proxy(){
        subject = new Proxy();
    }
    public Proxy(Object ... objects){}

    public void before(){

    }
    public void end(){

    }

    public void request() {
        this.before();
        this.subject.request();
        this.end();
    }
}
