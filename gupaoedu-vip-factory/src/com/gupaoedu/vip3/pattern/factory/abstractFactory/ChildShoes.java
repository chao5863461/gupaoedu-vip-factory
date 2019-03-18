package com.gupaoedu.vip3.pattern.factory.abstractFactory;

public class ChildShoes implements IChild{
    @Override
    public void buy() {
        System.out.println("购买孩子鞋子");
    }
}
