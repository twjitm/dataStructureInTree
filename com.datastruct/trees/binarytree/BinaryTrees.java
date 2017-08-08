package com.datastruct.trees.binarytree;

import com.datastruct.trees.binarytree.entity.TreeNode;
import com.datastruct.trees.binarytree.itree.AbstractTrees;
import com.datastruct.trees.binarytree.itree.IBinaryTrees;

import java.util.List;

/**
 * Created by 文江 on 2017/8/8.
 * 二叉树
 */
public class BinaryTrees extends AbstractTrees implements IBinaryTrees {
    public BinaryTrees(List datalist) {
        super(datalist);
    }

    @Override
    public TreeNode getRoot() {
        TreeNode node = super.initTree();
        return node;
    }

    @Override
    public List<TreeNode> afterSearch() {
        return null;
    }

    @Override
    public List<TreeNode> beforSearch() {
        return null;
    }

    @Override
    public List<TreeNode> rootSearch() {
        return null;
    }

    @Override
    public boolean isEmpty() {
        return false;
    }

    @Override
    public int size() {
        return 0;
    }

    @Override
    public int hight() {
        return 0;
    }
}
