package com.wjx.test.pattern.LSP;

/**
 * Created by hacke on 2017/4/23.
 */
public class Client {
    public static void main(String[] args) {
        HandGun gun = new HandGun();
        Soldier soldier = new Soldier();
        soldier.setGun(gun);
        soldier.action();
    }
}
