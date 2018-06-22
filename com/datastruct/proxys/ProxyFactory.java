package com.datastruct.proxys;

import java.lang.reflect.Proxy;

/**
 * Created by 文江 on 2018/5/24.
 */
public class ProxyFactory {

    public static Object getProxy(Object object) {
        MyInnovactionHandler handler = new MyInnovactionHandler(object);
        return Proxy.newProxyInstance(object.getClass().getClassLoader(),object.getClass().getInterfaces(),handler);

    }
}
