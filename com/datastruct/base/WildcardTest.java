package com.datastruct.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by 文江 on 2018/5/28.
 * 通配符学习：
 * 上界通配符：< ? extends Object>表示上边界限定通配符。
 * 下界通配符：< ? super Object>表示下边界限定通配符。
 */
public class WildcardTest {

    /**
     * 上界统配符：要么存放Number或者Number的子类。取的时候获得的是一个Number类型的一个对象
     */
    List<? extends Number> list = new ArrayList<Number>();


    /**
     * 下界通配符：要么放Integer或者Integer的父类，取的时候类型不确定。
     */
    List<? super Integer> list2 = new ArrayList<Number>();

    public void test() {
        Integer integer = 2;
        list2.add(integer);

        Object result = list2.get(0);
    }

    /**
     *  总结：限定通配符总是包括自己
       上界类型通配符：add方法受限
       下界类型通配符：get方法受限
       如果你想从一个数据类型里获取数据，使用 ? extends 通配符
       如果你想把对象写入一个数据结构里，使用 ? super 通配符
       如果你既想存，又想取，那就别用通配符
       不能同时声明泛型通配符上界和下界
     */

}
