package com.wjx.test.io;

import java.util.Collection;

/**
 * Created by hacke on 2017/4/16.
 */
public class PPrint {
    public static String pFormat(Collection<?> c){
        if(c.size() ==0 ){
            return "[]";
        }
        //StringBuilder better than StringBuffer.
        StringBuilder sb = new StringBuilder("[");
//        if(c.size() == 0){
//
//        }else{
//
//        }
        for(Object o : c){
            sb.append(","+ o);
        }
        sb.append("]");
        return sb.toString();
    }
}
