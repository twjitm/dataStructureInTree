package com.datastruct.trees.binarytree.entity;

/**
 * Created by 文江 on 2017/8/8.
 * 二叉树结点实体
 */
public class TreeNode {
    private Object object;
    private TreeNode leftNode;
    private TreeNode rightNode;

    public TreeNode(Object object) {
        this.object = object;
    }

    public Object getObject() {
        return object;
    }

    public void setObject(Object object) {
        this.object = object;
    }

    public TreeNode getLeftNode() {
        return leftNode;
    }

    public void setLeftNode(TreeNode leftNode) {
        this.leftNode = leftNode;
    }

    public TreeNode getRightNode() {
        return rightNode;
    }

    public void setRightNode(TreeNode rightNode) {
        this.rightNode = rightNode;
    }
}
