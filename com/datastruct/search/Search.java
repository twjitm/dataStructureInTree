package com.datastruct.search;

/**
 * Created by �Ľ� on 2018/4/16.
 * �����㷨
 */
public class Search {
    /**
     * ˳�����
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
     * �۰����
     *
     * @param array
     * @param key
     * @return
     */
    public static boolean halfSearch(int array[], int key) {
        int mid = array.length / 2;
        //���������������С����
        int max = array.length - 1;
        int min = 0;
        //�����м�����
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
     * ��������������
     *
     * @param array
     * @param key
     * @return
     */
    public static boolean BinarySortTreeSearch(int array[], int key) {

        return false;
    }

    //��ʼ��һ����
    public static void initBinaryTree(int array[]) {

    }

    public static void main(String[] args) {
        int array[] = {3, 6, 8, 9, 100, 300, 4, 199, 116, 36, 765, 567, 9873, 543, 424};
        System.out.println(halfSearch(array, 424));
    }
}
