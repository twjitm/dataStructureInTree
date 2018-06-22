package com.datastruct.proxys;

/**
 * Created by 文江 on 2018/5/24.
 */
public class Test {
    public static void main(String[] args) {
        Dogs dogs = new KingDogs();
        // dogs.sayName();
        Dogs target = new KingDogs();
        dogs = (Dogs) ProxyFactory.getProxy(target);
        dogs.sayName();
        Object o
                = new Object();
    }
}
