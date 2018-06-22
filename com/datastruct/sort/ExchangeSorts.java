package com.datastruct.sort;

import java.time.YearMonth;

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
                if (array[j] > array[j + 1]) {
                    int temp = array[j + 1];
                    array[j + 1] = array[j];
                    array[j] = temp;
                }
            }
        }
    }

    //冒泡排序算法改进
    public static void bubbleSort_1(int array[]) {
        if (array == null) return;
        int i = array.length - 1;
        while (i > 0) {
            int pos = 0;
            for (int j = 0; j < i; j++) {
                if (array[j] < array[j + 1]) {
                    pos = j;
                    array[j] ^= array[j + 1];
                    array[j + 1] ^= array[j];
                    array[j] ^= array[j + 1];
                }
            }
            i = pos;
        }
    }

    //冒泡排序再次改进版
    public static void bubbleSort_2(int array[]) {
        int low = 0;
        int high = array.length - 1;
        int j;
        while (low < high) {
            for (j = low; j < high; j++) {
                if (array[j] > array[j + 1]) {
                    swap(array, j, j + 1);
                }
            }
            high--;
            for (j = high; j > low; j--) {
                if (array[j] < array[j - 1]) {
                    swap(array, j, j - 1);
                }
                low++;
            }
        }


    }


    /**
     * 快速排序
     * <p>
     * 基本思想：
     * <p>
     * 1）选择一个基准元素,通常选择第一个元素或者最后一个元素,
     * 2）通过一趟排序讲待排序的记录分割成独立的两部分，其中一部分记录的元素值均比基准元素值小。
     * 另一部分记录的 元素值比基准值大。
     * 4）然后分别对这两部分记录用同样的方法继续进行排序，直到整个序列有序。
     *
     * @param
     */
    public static void quickSort1(int a[], int low, int hight) {
        if (a == null) {
            return;
        }
        if (low > hight) {
            return;
        }
        int intdex = a[low],
                i = low,
                j = hight;
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
        a[i] = intdex;
        quickSort1(a, low, i - 1);
        quickSort1(a, i + 1, hight);

    }

    //交换两个元素
    private static void swap(int array[], int i, int j) {
        /*int temp = array[i];
        array[i] = array[j];
        array[j] = temp;*/
        array[i] ^= array[j];
        array[j] ^= array[i];
        array[i] ^= array[j];
        // array[i] ^= array[j] ^= array[j] ^= array[i];
    }

    //一趟快速排序
    public int partition(int array[], int low, int high) {
        int partitionKey = array[low];
        while (low < high) {
            while (low < high && array[high] > partitionKey) {
                high--;
            }
            swap(array, low, high);
            while (low < high && array[low] < partitionKey) {
                low++;
            }
            swap(array, low, high);

        }
        return low;

    }

    /**
     * 一趟快速排序
     * @param array
     * @param low
     * @param hight
     * @return
     */
    public int oneQuickSort(int array[], int low, int hight) {
        int key = array[low];//标记
        while (low < hight) {
            while ((low < hight) && key < array[hight]) {
                hight--;
            }
            swap(array, low, hight);
            while ((low < hight) && key > array[low]) {
                low++;
            }
            swap(array, low, hight);
        }
        return low;
    }

    void quickSort(int array[], int low, int high) {
        if (low < high) {
            int parentKey = partition(array, low, high);
            quickSort(array, low, parentKey - 1);
            quickSort(array, parentKey + 1, high);
        }
    }


    private static int aqq = 0;

    public static void main(String[] args) {
        //Arrays.sort();
        int[] a = new int[]{1, 4, 7, 3, 8};
        // bubbleSort(a);
        //bubbleSort_1(a);
        bubbleSort_2(a);
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }

        YearMonth yearMonth = YearMonth.now();

    }

}
