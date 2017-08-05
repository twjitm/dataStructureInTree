package com.datastruct.linklist;

import com.datastruct.linklist.ILists.IList;
import com.datastruct.linklist.entity.Node;

/**
 * Created by 文江 on 2017/8/5.
 * 链式存储结构的线性表
 */
public class LinkLists implements IList {
    private Node head;

    public LinkLists() {
        head = new Node();
    }

    public Node getHead() {
        return head;
    }

    public void setHead(Node head) {
        this.head = head;
    }

    @Override
    public Object get(int i) throws Exception {
        Node node = this.head.getNextNode();
        int j = 0;
        while (node != null) {
            node = node.getNextNode();
            j++;
            if (j == i) {
                break;
            }
        }
        if (i < 0 || null == node) {
            throw new Exception("limit " + i + "data no find");
        }
        return node.getValue();
    }

    @Override
    public boolean isEmpty() {
        return head.getNextNode() == null;
    }

    @Override
    public int length() {
        Node node = this.head.getNextNode();
        int i = 0;
        while (node != null) {
            node = node.getNextNode();
            i++;
        }
        return i;
    }

    @Override
    public int set(int position, Object v) throws Exception {
        if (position < 0) {
            throw new IndexOutOfBoundsException("error");
        }
        Node node = this.head;
        int i = 0;
        while (i != position) {
            node = node.getNextNode();
            i++;
        }
        if (node != null) node.setValue(v);
        return position;
    }

    //头插发
    @Override
    public void insert(int position, Object v) throws Exception {
        Node node = this.head.getNextNode();
        if (position < 0) {
            throw new Exception("position must Greater than 0");
        }
        if (position == 0) {
            Node hand = this.head;
            Node n = new Node();
            n.setValue(v);
            n.setNextNode(hand);
            this.head = n;
        }
        int i = 0;
        while (i == position) {
            node = node.getNextNode();
            i++;
        }
        Node next = node.getNextNode();
        Node newNode = new Node();
        newNode.setNextNode(next);
        newNode.setValue(v);
        node.setNextNode(newNode);
    }


    @Override
    public Node remove(int i) {
        if (i < 0) {
            return null;
        }
        Node node = this.head.getNextNode();
        int j = 0;
        while (j == i) {
            node = node.getNextNode();
        }
        if (node != null) {
            Node temp = node;
            node = null;
            return temp;
        }
        return null;
    }

    @Override
    public void removeAll() {
        this.head = null;
    }

    @Override
    public Object indexOf(Object key) {
        Node node = this.head;
        int i = -1;
        while (node.getNextNode() != null) {
            if (node.getNextNode() != null) {
                if (node.getNextNode().getValue().equals(key)) {
                    return i;
                }
            }
            i++;
        }
        return -1;
    }


}
