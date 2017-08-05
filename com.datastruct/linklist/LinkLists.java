package com.datastruct.linklist;

import com.datastruct.linklist.ILists.IList;
import com.datastruct.linklist.entity.Node;

/**
 * Created by 文江 on 2017/8/5.
 * 链式存储结构的线性表
 */
public class LinkLists implements IList<Node> {
    private Node head;

    public LinkLists() {
        head = new Node();
    }
    

    @Override
    public Node get(int i) {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int length() {
        return 0;
    }

    @Override
    public int set(int position, Node v) {
        return 0;
    }

    @Override
    public void insert(int i, Node x) {

    }

    @Override
    public Node remove(int i) {
        return null;
    }

    @Override
    public void removeAll() {

    }

    @Override
    public Node indexOf(Node key) {
        return null;
    }
}
