package com.gupaoedu.vip3.pattern.factory.abstractFactory;

public class ShopsFactory implements IShoppingFactory{
    @Override
    public IMen CreateMen() {
        return new MenShoes();
    }

    @Override
    public IWomen CreateWomen() {
        return null;
    }

    @Override
    public IChild CreateChild() {

        return new ChildShoes();
    }
}
