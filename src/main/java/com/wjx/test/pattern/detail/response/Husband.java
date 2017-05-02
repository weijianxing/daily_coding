package com.wjx.test.pattern.detail.response;

/**
 * Created by hacke on 2017/5/1.
 */
public class Husband extends Handler {
    public Husband(){
        super(Handler.HUSBAND_LEVEL_REQUEST);
    }
    @Override
    protected void response(IWomen women) {
        System.out.println(" ========request husband.============");
        System.out.println(women.getRequest());
        System.out.println("husband response yes.");
    }
}
