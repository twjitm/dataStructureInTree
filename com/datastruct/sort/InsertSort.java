package com.sf;

/**
 * Created by Administrator on 2017/8/21.
 * insert sort
 */
public class InsertSort {
    /**
     * 1、首先比较数组的前两个数据，并排序；
     　2、比较第三个元素与前两个排好序的数据，并将第三个元素放入适当的位置；
     　3、比较第四个元素与前三个排好序的数据，并将第四个元素放入适当的位置；
     　 ......
     　4、直至把最后一个元素放入适当的位置。
     * @param array
     */
     public static  void  directSort(Integer array[]) {
         if (array == null) {
             return;
         }
         for (int i = 1; i < array.length; i++) {
             int temp = array[i];
             int j;
             for (j = i - 1; j >= 0; j--) {
                 if (array[j] > array[j + 1]) {
                     array[j] = array[j + 1];
                 } else {
                     break;
                 }
             }
             array[j+1] = temp;
         }
     }

    /**
     * 二分插入排序算法（shell）
     * 设有一个序列a[0],a[1]...a[n];其中a[i-1]前是已经有序的,当插入时a[i]时,利用二分法搜索a[i]插入的位置
     * 先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序。
     * 1 选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
       2 按增量序列个数k，对序列进行k 趟排序；
       3 每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
     * @param array
     */
 public static  void doubleSort(Integer[] array) {
     if (array == null) {
         return;
     }
     int tag = array.length / 2;
     while (tag > 1) {

     }
 }



    public static void main(String[] args) {
         Integer[] a={1,9,4,3,6};
         directSort(a);
         for(int i=0;i<a.length;i++){
             System.out.println(a[i]);
         }
    }
}
