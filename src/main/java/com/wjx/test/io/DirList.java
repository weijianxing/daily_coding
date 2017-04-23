package com.wjx.test.io;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Arrays;
import java.util.regex.Pattern;

/**
 * Created by hacke on 2017/4/16.
 */
public class DirList {
    public static FilenameFilter filter(final  String regex){
        return new FilenameFilter(){
            private Pattern pattern = Pattern.compile(regex);
            public boolean  accept(File dir , String name){
                return  pattern.matcher(name).matches();
            }
        };
    }

    public static void main(String[] args) {
        File path = new File("D:\\daily_coding\\src\\main\\java\\com\\wjx\\test\\io");
        String[] list;
//        if(args.length == 0){
//            list = path.list();
//        }else{
//            //list = path.list(filter(args[0]));
//            list = path.list(filter("java"));
//            Arrays.sort(list , String.CASE_INSENSITIVE_ORDER);
//        }
//        list = path.list(filter("xml"));
//        list = path.list();
         Pattern pattern = Pattern.compile("\\S+");
        boolean res = pattern.matcher("Dlist.java").matches();
        System.out.println("result is : " + res);
        list = path.list(filter("\\S+"));
        for(String dirItem : list){
            System.out.println(dirItem);
        }
    }
}
