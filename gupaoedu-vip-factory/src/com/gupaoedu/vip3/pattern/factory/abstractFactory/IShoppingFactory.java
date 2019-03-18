package com.gupaoedu.vip3.pattern.factory.abstractFactory;

public interface IShoppingFactory {

    IMen CreateMen();
    IWomen CreateWomen();
    IChild CreateChild();
}
