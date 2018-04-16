package com.datastruct.sort;

/**
 * Created by 文江 on 2018/4/16.
 * 归并排序算法
 */
public class MergeSort {
/**
 * 归并排序算法
 * 归并（Merge）排序法是将两个（或两个以上）有序表合并成一个新的有序表，即把待排序序列分为若干个子序列，
 * 每个子序列是有序的。然后再把有序子序列合并为整体有序序列。
 * 归并排序示例：
 * 49 38 65 97 13 27
 * |  |  |  |  |  |
 * (38 49) (65 97) (13,27)
 * (38,49 65 97)(13,27)
 * 13,27,38,49,65 97
 */

    /**
     * 将两个有序数组合并到一个数组里面
     *
     * @param merge1
     * @param merge2
     * @param result
     */
    public static void merge(int merge1[], int merge2[], int result[]) {
        int merger1_length = merge1.length;
        int merger2_length = merge2.length;
        int result_length = result.length;
        if (merger1_length + merger2_length != result_length) return;
        int i, j, k;
        i = j = k = 0;
        while (i < merger1_length && j < merger2_length) {
            if (merge1[i] < merge2[j]) {
                result[k] = merge1[i];
                k++;
                i++;
            } else {
                result[k] = merge2[j];
                k++;
                j++;
            }
        }
        while (i < merger1_length) {
            result[k] = merge1[i];
            k++;
            i++;
        }
        while (j < merger2_length) {
            result[k] = merge2[j];
            k++;
            j++;
        }
    }

    /**
     * 将ow-mid的有序序列和mid+1-high合并
     *
     * @param array
     * @param low
     * @param mid
     * @param high
     * @param temp
     */
    public static void merge(int[] array, int low, int mid, int high, int[] temp) {
        int k = 0;
        int j = mid + 1;
        int m = mid;
        int i = low;
        while (i <= m && j <= high) {
            if (array[i] <= array[j]) {
                temp[k] = array[i];
                i++;
                k++;
            } else {
                temp[k] = array[j];
                k++;
                j++;
            }
            while (i <= low) {
                temp[k] = array[i];
                k++;
                i++;
            }
            while (j <= high) {
                temp[k] = array[j];
                j++;
                k++;
            }
            for (i = 0; i < k; i++) {
                array[low + i] = temp[i];
            }

        }

    }

    public static void mergeSort(int array[], int low, int high, int[] temp) {
        if (low < high) {
            int mid = (low + high) / 2;
            mergeSort(array, low, mid, temp);
            mergeSort(array, mid + 1, high, temp);
            merge(array, low, mid, high, temp);
        }

    }


    public static void main(String[] args) {
        int array[] = {1, 2, 3};
        int array1[] = {3, 4, 5};
        int resule[] = new int[6];
        int test[] = {4, 6, 1, 8, 3, 9, 0};
        mergeSort(test, 0, test.length - 1, new int[test.length]);
    }

}
