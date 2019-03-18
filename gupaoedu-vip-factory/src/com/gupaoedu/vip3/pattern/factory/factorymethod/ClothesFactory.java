package com.gupaoedu.vip3.pattern.factory.factorymethod;

public class ClothesFactory implements Factory{
    @Override
    public Shopping shopping() {
        return new Clothes();
    }
}
