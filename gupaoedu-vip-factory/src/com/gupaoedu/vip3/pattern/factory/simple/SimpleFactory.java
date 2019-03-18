package com.gupaoedu.vip3.pattern.factory.simple;

public class SimpleFactory {

    public static Shopping shoppign(Class clazz){
//        if("cloths".equals(type)){
//            return new Clothes();
//        }else if("shoes".equals(type)){
//            return  new Shoes();
//        }else if("trousers".equals(type)){
//            return  new Trousers();
//        }
        try {
            if(null != clazz){
                return  (Shopping) clazz.newInstance();
            }
        }catch (Exception e ){
            e.printStackTrace();
        }
        return null;
    }
}
