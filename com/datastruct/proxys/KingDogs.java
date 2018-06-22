package com.datastruct.proxys;

/**
 * Created by 文江 on 2018/5/24.
 */
public class KingDogs implements Dogs {
    @Override
    public String sayName() {
        String name = "one big king dog";
        System.out.println(name);
        return name;
    }

    @Override
    public String saySex() {
        String sex = "一条公的大狗";
        System.out.println(sex);
        return sex;
    }
}
