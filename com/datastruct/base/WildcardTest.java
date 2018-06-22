package com.datastruct.base;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by �Ľ� on 2018/5/28.
 * ͨ���ѧϰ��
 * �Ͻ�ͨ�����< ? extends Object>��ʾ�ϱ߽��޶�ͨ�����
 * �½�ͨ�����< ? super Object>��ʾ�±߽��޶�ͨ�����
 */
public class WildcardTest {

    /**
     * �Ͻ�ͳ�����Ҫô���Number����Number�����ࡣȡ��ʱ���õ���һ��Number���͵�һ������
     */
    List<? extends Number> list = new ArrayList<Number>();


    /**
     * �½�ͨ�����Ҫô��Integer����Integer�ĸ��࣬ȡ��ʱ�����Ͳ�ȷ����
     */
    List<? super Integer> list2 = new ArrayList<Number>();

    public void test() {
        Integer integer = 2;
        list2.add(integer);

        Object result = list2.get(0);
    }

    /**
     *  �ܽ᣺�޶�ͨ������ǰ����Լ�
       �Ͻ�����ͨ�����add��������
       �½�����ͨ�����get��������
       ��������һ�������������ȡ���ݣ�ʹ�� ? extends ͨ���
       �������Ѷ���д��һ�����ݽṹ�ʹ�� ? super ͨ���
       ��������棬����ȡ���Ǿͱ���ͨ���
       ����ͬʱ��������ͨ����Ͻ���½�
     */

}
