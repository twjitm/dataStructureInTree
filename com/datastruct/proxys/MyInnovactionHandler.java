package com.datastruct.proxys;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by 文江 on 2018/5/24.
 */
public class MyInnovactionHandler implements InvocationHandler {

    private Object proxy;

    public MyInnovactionHandler(Object proxy) {
        this.proxy = proxy;
    }

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("执行代理方法前");
        Object result = method.invoke(this.proxy, args);
        System.out.println("执行方法后");
        result.wait();
        return result;
    }
}
