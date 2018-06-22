package com.datastruct.jvms;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;

/**
 * jvm测试
 */
public class JvmTest {
    public static Object instance = null;
    private int int_1_MB = 1024 * 1024;
    private byte[] bage_Size = new byte[2 * int_1_MB];

    public static void main(String[] args) {
        /*JvmTest jvmTestA = new JvmTest();
        JvmTest jvmTestB = new JvmTest();
        jvmTestA.instance = jvmTestB;
        jvmTestB.instance = jvmTestA;
        jvmTestA = null;
        jvmTestB = null;
        System.gc();*/
       /* instance=new JvmTest();
        System.gc();
        if(instance!=null){
            System.out.println("this object is alive");
        }*/
        outmemoryErr();

    }

    @Override
    protected void finalize() throws Throwable {
        super.finalize();
        JvmTest.instance = this;
    }

    public final  void test(){}
    public final  void test(int i){

    }

    private  static void outmemoryErr(){
        List<byte[]>list=new ArrayList<>();
        int i=0;
        while (true){
            list.add(new byte[1024*1024]);
            i++;
            System.out.println(i);
        }
    }
    private static  void stackMemoryError(){
        ConcurrentHashMap concurrentHashMap=new ConcurrentHashMap();
        LinkedHashMap linkedHashMap=new LinkedHashMap();
    }
}
