package com.wjx.test.pattern.detail.response;

/**
 * Created by hacke on 2017/5/1.
 */
public class Son extends Handler {
    public Son(){
        super(Handler.SON_LEVEL_REQUEST);
    }
    @Override
    protected void response(IWomen women) {
        System.out.println("======== request son.============");
        System.out.println(women.getRequest());
        System.out.println("son response yes.");
    }
}
