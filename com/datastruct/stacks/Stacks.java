package com.datastruct.stacks;

import com.datastruct.stacks.istacks.IStacks;

/**
 * Created by 文江 on 2017/8/5.
 * 栈；栈是一种限制插入和删除只能在一个位置上的表。
 * 最基本的操作是进栈和出栈，因此，又被叫作“先进后出”表。
 */
public class Stacks<T> implements IStacks<T> {

    private int top = -1;
    private int capacity = 10;
    private T[] array;

    public Stacks(int capacity) {
        this.capacity = capacity;
        array = (T[]) new Object[this.capacity];
    }

    public Stacks() {
        this.array = (T[]) new Object[this.capacity];
    }

    @Override
    public boolean isEmpty() {
        return top == -1;
    }

    //入栈
    @Override
    public void push(T data) {
        //栈满：扩展
        if (this.capacity == top + 1) {
            T[] temp = this.array;
            this.capacity = this.capacity * 2;
            this.array = (T[]) new Object[this.capacity];
            for (int i = 0; i < temp.length; i++) {
                this.array[i] = temp[i];
                this.top = temp.length - 1;
            }
        }
        //end 扩容
        this.array[top] = data;
        top++;
    }

    @Override
    public T peek() {
        if (top == -1) {
            return null;
        }
        return this.array[top];
    }

    @Override
    public T pop() {
        if (top == -1) {
            throw new NullPointerException("stacks is null");
        }
        T temp = this.array[top];
        top--;
        return temp;
    }
}
