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
    public static void quickSort1(int a[], int low, int hight) {
        if (a == null) {
            return;
        }
        if (low > hight) {
            return;
        }
        int intdex = a[low], i = low, j = hight;
        while (i < j) {
            while (i < j && a[j] >= intdex) {
                j--;
            }
            if (i < j) {
                a[i++] = a[j];
            }
            while (i < j && a[i] < intdex) {
                i++;
            }
            if (i < j) {
                a[j--] = a[i];
            }
        }
        a[i]=intdex;
        quickSort1(a,low,i-1);
        quickSort1(a,i+1,hight);

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
