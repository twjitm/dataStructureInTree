package com.datastruct.sort;

/**
 * Created by 文江 on 2017/8/20.
 * 交换排序
 */
public class ExchangeSorts {
    /**
     * 冒泡排序
     *
     * @param array
     */
    public static void bubbleSort(Integer[] array) {
        if (array == null || array.length == 0) {
            return;
        }
        for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] < array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    /**
     * 快速排序
     *
     * @param array
     */
    public void fastSort(int array[]) {
        

    }


    public static void main(String[] args) {
        //Arrays.sort();
        Integer[] a = new Integer[]{1, 4, 7, 3, 8};
        bubbleSort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
    }

}
