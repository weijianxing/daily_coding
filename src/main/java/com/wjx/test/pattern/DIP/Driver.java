package com.wjx.test.pattern.DIP;

/**
 * Created by hacke on 2017/4/23.
 */
public class Driver implements IDriver {
    private ICar iCar;
    //throught construction inject dependency.
//    public Driver(ICar iCar){
//        this.iCar = iCar;
//    }

    //though set inject dependency.
    public void setCar(ICar icar) {
        this.iCar = icar;
    }

    public void drive() {
        iCar.run();
    }

}
