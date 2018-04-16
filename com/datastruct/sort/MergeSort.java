package com.datastruct.sort;

/**
 * Created by �Ľ� on 2018/4/16.
 * �鲢�����㷨
 */
public class MergeSort {
/**
 * �鲢�����㷨
 * �鲢��Merge�������ǽ����������������ϣ������ϲ���һ���µ���������Ѵ��������з�Ϊ���ɸ������У�
 * ÿ��������������ġ�Ȼ���ٰ����������кϲ�Ϊ�����������С�
 * �鲢����ʾ����
 * 49 38 65 97 13 27
 * |  |  |  |  |  |
 * (38 49) (65 97) (13,27)
 * (38,49 65 97)(13,27)
 * 13,27,38,49,65 97
 */

    /**
     * ��������������ϲ���һ����������
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
     * ��ow-mid���������к�mid+1-high�ϲ�
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
