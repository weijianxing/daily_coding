package com.wjx.test.pattern.LSP;

/**
 * Created by hacke on 2017/4/23.
 */
public class Soldier {
//    public void shoot(AbstractGun gun){
//        gun.shoot();
//    }
    private AbstractGun gun;

    public void setGun(AbstractGun _gun){
        this.gun = _gun;
    }

    public void action(){
        System.out.println("soldier preparing.");
        gun.shoot();
    }
}
