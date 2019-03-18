package com.gupaoedu.vip3.pattern.factory.factorymethod;

public class TrousersFactory implements Factory{
    @Override
    public Shopping shopping() {
        return new Trousers();
    }
}
