package com.wjx.test.pattern.detail.factory;

/**
 * Created by hacke on 2017/4/23.
 */
public class HumanFactory  extends AbstractHumanFactory{
    @Override
    public <T extends Human> T createHuman(Class<T> c) {
        Human human = null;

//            if(c.getName().toLowerCase().endsWith("yellowhuman")){
//                human = new YellowHuman();
//            }else{
//                return null;
//            }
        try {
            human = (Human)Class.forName(c.getName()).newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        } catch (ClassNotFoundException e) {
            e.printStackTrace();
        }


        return (T)human;
    }
}
