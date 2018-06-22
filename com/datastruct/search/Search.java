package com.datastruct.search;

/**
 * Created by 文江 on 2018/4/16.
 * 查找算法
 */
public class Search<T extends Comparable<T>> {
    /**
     * 顺序查找
     *
     * @param array
     * @param key
     * @return
     */
    public static boolean orderSearch(int[] array, int key) {
        for (int value : array) {
            if (key == value) {

                return true;
            }
        }
        return false;
    }

    /**
     * 折半查找
     *
     * @param array
     * @param key
     * @return
     */
    public static boolean halfSearch(int array[], int key) {
        int mid = array.length / 2;
        //定义最大索引和最小索引
        int max = array.length - 1;
        int min = 0;
        //计算中间索引
        while (array[mid] != key) {
            if (array[mid] > key) {
                max = max - 1;
            }
            if (array[mid] < key) {
                min++;
            }
            if (min > max) {
                return false;
            }
            mid = (max + max) / 2;
        }

        return true;
    }

    /**
     * 二叉排序树查找
     *
     * @param array
     * @param key
     * @return
     */
    public static boolean BinarySortTreeSearch(int array[], int key) {

        return false;
    }

    //初始化一个数
    public static void initBinaryTree(int array[]) {

    }

    public static void main(String[] args) {
        int array[] = {1, 3, 5, 7, 9, 12, 15, 17, 19, 21, 23, 25, 27, 29, 31};
        System.out.println(halfSearch3(array, 22));
    }

    public static boolean halfSearch2(int array[], int k) {
        int mid = array.length / 2;
        int max = array.length - 1;
        int min = 0;
        while (array[mid] != k) {
            if (array[mid] < k) {
                max = max - 1;
            }
            if (array[mid] > k) {
                min = min + 1;
            }
            if (max < min) {
                return false;
            }
            mid = (max + min) / 2;
        }
        return true;
    }

    public static boolean halfSearch3(int[] array, int keys) {
        int min = 0;
        int max = array.length - 1;
        int midIndex = array.length / 2;
        while (array[midIndex] != keys) {
            if (array[midIndex] > keys) {
                max = midIndex - 1;
            }
            if (array[midIndex] < keys) {
                min = midIndex + 1;
            }
            if (min >= max) {
                return false;
            }
            midIndex = (max + min) / 2;
        }
        return true;
    }

    //二叉排序树查找
    public class BSTree<T extends Comparable<T>> {
        T key;
        BSTree left;
        BSTree right;
        BSTree parent;

        public BSTree(T key, BSTree left, BSTree right, BSTree parent) {
            this.key = key;
            this.left = left;
            this.right = right;
            this.parent = parent;
        }

        public T getKey() {
            return key;
        }

        public void setKey(T key) {
            this.key = key;
        }

        public BSTree getLeft() {
            return left;
        }

        public void setLeft(BSTree left) {
            this.left = left;
        }

        public BSTree getRight() {
            return right;
        }

        public void setRight(BSTree right) {
            this.right = right;
        }

        public BSTree getParent() {
            return parent;
        }

        public void setParent(BSTree parent) {
            this.parent = parent;
        }
    }

    //前序遍历代码
    private void perOrder(BSTree tree) {
        if (tree != null) {
            System.out.println(tree.key);
            perOrder(tree.left);
            perOrder(tree.right);
        }
    }

    //中序遍历
    private void inOrder(BSTree tree) {
        if (tree != null) {
            inOrder(tree.left);
            System.out.println(tree.key);
            inOrder(tree.right);
        }
    }

    //后续遍历
    private void postOrder(BSTree tree) {
        if (tree != null) {
            postOrder(tree.left);
            postOrder(tree.right);
            System.out.println(tree.key);
        }
    }

    public BSTree<T> serarch(BSTree<T> tree, T key) {
        while (tree != null) {
            int com = key.compareTo(tree.key);
            if (com < 0) tree = tree.left;
            else if (com > 0) tree = tree.right;
            else return tree;

        }
        return tree;
    }

}
