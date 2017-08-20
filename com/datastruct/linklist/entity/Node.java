package com.datastruct.linklist.entity;

/**
 * Created by 文江 on 2017/8/5.
 * 链表节点实体
 */
public class Node {
    private Object value;
    private Node nextNode;

    public Object getValue() {
        return value;
    }

    public void setValue(Object value) {
        this.value = value;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}
