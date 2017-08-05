package com.datastruct.linklist;

/**
 * Created by 文江 on 2017/8/5.
 * 线性表
 */

import com.datastruct.linklist.ILists.IArrayLists;

/**
 * 说明:线性表：n个数据元素的有序集合。
 * 特征：
 * 1．集合中必存在唯一的一个“第一元素”；
 * 2．集合中必存在唯一的一个 “最后元素” ；
 * 3．除最后一个元素之外，均有 唯一的后继(后件)；
 * 4．除第一个元素之外，均有 唯一的前驱(前件)。
 * Java中的List接口，就是线性表。ArrayList就是顺序线性表，LinkedList就是链表线性表。
 */

public class ArrayLists<T> implements IArrayLists {
    protected Object[] objarr;
    protected int length;

    /**
     * constructor
     */
    public ArrayLists() {
        length = 64;
    }

    public ArrayLists(int length) {
        this.objarr = new Object[length];
        this.length = 0;
    }

    public ArrayLists(Object[] objarr) {
        this.objarr = objarr;
        this.length = this.objarr.length;
    }


    @Override
    public T get(int i) {
        if (i >= 0 && i < objarr.length) {
            return (T) this.objarr[i];
        }
        return null;
    }

    @Override
    public boolean isEmpty() {
        return this.length == 0;
    }

    @Override
    public int length() {
        return this.length;
    }

    @Override
    public int set(int position, Object v) {
        if (null == v) {
            return 0;
        }
        if (position >= 0 && position < this.objarr.length) {
            this.objarr[position] = v;
        }
        if (position >= this.objarr.length) {
            throw new IndexOutOfBoundsException("set error");
        }
        return position;
    }

    @Override
    public void insert(int position, Object x) {
        if (null == x) {
            return;
        }
        //数组容量已满，进行自动扩容
        if (this.length == this.objarr.length) {
            Object[] temp = this.objarr;
            this.objarr = new Object[temp.length * 2];
            for (int i = 0; i < temp.length; i++) {
                this.objarr[i] = temp[i];
            }
        }
        //end 扩容
        if (position < 0) position = 0;
        if (position > this.length) position = length - 1;
        for (int i = this.length - 1; i > position; i--) {
            this.objarr[i + 1] = this.objarr[i];
        }
        this.objarr[position] = x;
        this.length++;
    }

    @Override
    public Object remove(int i) {
        if (this.length == 0 || i < 0 || i >= length) return null;
        T t = (T) this.objarr[i];
        for (int j = i; j < this.length - 1; j++) {
            this.objarr[j] = this.objarr[j + 1];
        }
        this.objarr[this.length - 1] = null;
        this.length--;
        return t;
    }

    @Override
    public void removeAll() {
        this.length = 0;
    }

    @Override
    public Object indexOf(Object key) {
        if (this.length == 0) {
            return -1;
        }
        for (int i = 0; i < this.objarr.length; i++) {
            if (this.objarr[i].equals(key)) {
                return i;
            }
        }
        return -1;
    }

    @Override
    public void append(Object x) {
        insert(this.length, x);
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof ArrayLists) {
            ArrayLists<T> tempobj = (ArrayLists) obj;
            for (int i = 0; i < this.length; i++) {
                if (!tempobj.get(i).equals(this.objarr[i])) {
                    return false;
                }
            }
        }
        return false;
    }
}
