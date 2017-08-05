package com.datastruct.linklist.ILists;

/**
 * Created by 文江 on 2017/8/5.
 * 线性表上面的操作
 */
public interface IArrayLists<T> extends IList<T> {
    /**
     * 在线性表最后插入x元素
     *
     * @param x
     */
    public void append(T x);

}
