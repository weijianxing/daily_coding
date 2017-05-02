package com.wjx.test.pattern.detail.response;

import java.util.ArrayList;
import java.util.Random;

/**
 * Created by hacke on 2017/5/1.
 */
public class Client {



    public static void main(String[] args) {
        Random random = new Random();
        ArrayList<IWomen> arrayList = new ArrayList();
        for(int i= 0; i<5 ;i++){
            int type = random.nextInt(4);
            System.out.println(" type is : " + type);
            arrayList.add(new Women(type , "blabla"));
        }

        Handler father = new Father();
        Handler husband = new Husband();
        Handler son = new Son();
        father.setNext(husband);
        husband.setNext(son);
        for(IWomen women : arrayList){
            father.handleMessage(women);
        }
    }
}
