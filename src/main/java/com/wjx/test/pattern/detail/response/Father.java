package com.wjx.test.pattern.detail.response;

/**
 * Created by hacke on 2017/5/1.
 */
public class Father extends Handler {
    public Father(){
        super(Handler.FATHER_LEVEL_REQUEST);
    }
    //@Override
    protected void response(IWomen women) {
        System.out.println("========= request father.===========");
        System.out.println(women.getRequest());
        System.out.println("father response yes.");
    }
}
