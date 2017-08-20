package com.datastruct.linklist.ILists;

/**
 * Created by 文江 on 2017/8/5.
 * 链表上面的基本操作
 */
public interface IList<T> {
    /**
     * 返回第i（i≥0）个元素
     *
     * @param i
     * @return
     */
    public T get(int i) throws Exception;

    /**
     * 判断线性表是否空
     *
     * @return
     */
    public boolean isEmpty();


    /**
     * 返回线性表长度
     *
     * @return
     */
    public int length();

    /**
     * 设置第i个元素值为x
     *
     * @param position
     * @param v
     */
    public int set(int position, T v) throws Exception;

    /**
     * 插入x作为第i个元素
     *
     * @param i
     * @param x
     */
    void insert(int i, T x) throws Exception;

    /**
     * 删除第i个元素并返回被删除对象
     *
     * @param i
     * @return
     */
    T remove(int i);

    /**
     * 删除线性表所有元素
     */
    void removeAll();

    /**
     * 某个值的位置
     *
     * @param key
     * @return
     */
    T indexOf(T key);

}
