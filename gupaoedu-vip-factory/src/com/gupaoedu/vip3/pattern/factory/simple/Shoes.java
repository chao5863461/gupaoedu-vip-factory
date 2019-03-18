package com.gupaoedu.vip3.pattern.factory.simple;

public class Shoes implements Shopping {
    @Override
    public void buy() {
        System.out.println("购买鞋子");
    }
}
