package com.datastruct.stacks.istacks;

/**
 * Created by 文江 on 2017/8/6.
 */
public interface IStacks<T> {
    /**
     * 栈是否为空
     *
     * @return
     */
    boolean isEmpty();

    /**
     * data元素入栈
     *
     * @param data
     */
    void push(T data);

    /**
     * 返回栈顶元素,未出栈
     *
     * @return
     */
    T peek();

    /**
     * 出栈,返回栈顶元素,同时从栈中移除该元素
     *
     * @return
     */
    T pop();
}
