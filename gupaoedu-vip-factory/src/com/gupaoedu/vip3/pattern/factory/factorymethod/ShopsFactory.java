package com.gupaoedu.vip3.pattern.factory.factorymethod;

public class ShopsFactory implements Factory {
    @Override
    public Shopping shopping() {
        return new Shoes();
    }
}
