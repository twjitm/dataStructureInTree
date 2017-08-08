package com.datastruct.trees.binarytree.itree;

import com.datastruct.trees.binarytree.entity.TreeNode;

import java.util.List;

/**
 * Created by 文江 on 2017/8/8.
 */
public interface IBinaryTrees {
    //public TreeNode getRoot();
    public List<TreeNode> afterSearch();

    public List<TreeNode> beforSearch();

    public List<TreeNode> rootSearch();


    /**
     * 判空
     *
     * @return
     */
    boolean isEmpty();

    /**
     * 二叉树的结点个数
     *
     * @return
     */
    int size();

    /**
     * 返回二叉树的高度或者深度,即结点的最大层次
     *
     * @return
     */
    int hight();
}
