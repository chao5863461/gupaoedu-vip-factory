package com.gupaoedu.vip3.pattern.factory.factorymethod;

public class FactoryMethodTest {
    public static void main(String[] args) {
        Factory factory = new ClothesFactory();
        factory.shopping().buy();
    }
}
