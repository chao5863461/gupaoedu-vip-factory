package com.gupaoedu.vip3.pattern.factory.abstractFactory;

public class AbstractFactoryTest {
    public static void main(String[] args) {

        IShoppingFactory shoppingFactory = new ShopsFactory();
        shoppingFactory.CreateMen().buy();
        shoppingFactory.CreateChild().buy();

        shoppingFactory = new ClothsFactory();
        shoppingFactory.CreateWomen().buy();

    }
}
