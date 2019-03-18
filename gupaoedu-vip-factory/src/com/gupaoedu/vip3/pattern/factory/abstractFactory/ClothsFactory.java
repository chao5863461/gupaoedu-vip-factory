package com.gupaoedu.vip3.pattern.factory.abstractFactory;

public class ClothsFactory implements IShoppingFactory{
    @Override
    public IMen CreateMen() {
        return null;
    }

    @Override
    public IWomen CreateWomen() {
        return new WomenCloths();
    }

    @Override
    public IChild CreateChild() {
        return null;
    }
}
