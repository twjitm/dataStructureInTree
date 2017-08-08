package com.datastruct.trees.binarytree.itree;

import com.datastruct.trees.binarytree.entity.TreeNode;

import java.util.List;

/**
 * Created by 文江 on 2017/8/8.
 */
public abstract class AbstractTrees<T> {
    private List<T> datalist;
    private TreeNode root;

    public abstract TreeNode getRoot();

    public AbstractTrees(List<T> datalist) {
        this.datalist = datalist;
    }

    public TreeNode initTree() {
        for (T t : this.datalist) {
            init(t);
        }
        return null;
    }

    private void init(T t) {
        if (null == root) {
            root = new TreeNode(t);
        } else {
            TreeNode treeNode
        }

    }

}
