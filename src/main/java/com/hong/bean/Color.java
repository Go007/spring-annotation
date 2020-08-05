package com.hong.bean;

/**
 * @Description:
 * @Author wanghong
 * @Date 2020/8/5 11:17
 * @Version V1.0
 **/
public class Color {

    public Color(){
        System.out.println("Color Constructor");
    }

    private Car car;

    public Car getCar() {
        return car;
    }

    public void setCar(Car car) {
        this.car = car;
    }

    @Override
    public String toString() {
        return "Color [car=" + car + "]";
    }
}
