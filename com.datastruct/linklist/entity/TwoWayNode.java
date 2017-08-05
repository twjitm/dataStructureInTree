package com.datastruct.linklist.entity;

/**
 * Created by 文江 on 2017/8/5.
 */
public class TwoWayNode {
    private TwoWayNode lastNode;
    private Object data;
    private TwoWayNode next;

    public TwoWayNode getLastNode() {
        return lastNode;
    }

    public void setLastNode(TwoWayNode lastNode) {
        this.lastNode = lastNode;
    }

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public TwoWayNode getNext() {
        return next;
    }

    public void setNext(TwoWayNode next) {
        this.next = next;
    }
}
