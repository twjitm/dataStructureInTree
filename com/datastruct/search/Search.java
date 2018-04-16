package com.datastruct.search;

/**
 * Created by 文江 on 2018/4/16.
 * 查找算法
 */
public class Search {
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
            mid=(max+max)/2;
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
        int array[] = {3, 6, 8, 9, 100, 300, 4, 199, 116, 36, 765, 567, 9873, 543, 424};
        System.out.println(halfSearch(array, 424));
    }
}
