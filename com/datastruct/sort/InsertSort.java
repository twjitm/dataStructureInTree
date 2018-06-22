package com.datastruct.sort;

/**
 * Created by Administrator on 2017/8/21.
 * insert sort
 */
public class InsertSort {

    /**
     * 插入排序，在已经排好序的序列里面插入一个数，然后在进行排序
     *
     * @param array
     * @param n
     */
    public static void insertSort(int array[], int n) {
        for (int i = 1; i < n; i++) {
            if (array[i] < array[i - 1]) {
                int j = i - 1;
                int temp = array[i];
                array[i] = array[i - 1];
                //找到插入位置
                while (temp < array[j]) {
                    array[j + 1] = array[j];
                    j--;
                    if (j <= 0) {
                        break;
                    }
                }
                array[j + 1] = temp;
            }
        }

    }

    //插入排序练习练习
    public void insertTemp(int array[], int length) {
        for (int i = 1; i < length; i++) {
            if (array[i] < array[i - 1]) {
                int j = i - 1;
                int temp = array[i - 1];
                while (temp < array[j]) {
                    array[j + 1] = array[j];
                    j--;
                    if (j <= 0) {
                        break;
                    }
                }
                array[j + 1] = temp;
            }
        }
    }

    //默写插入排序
    public static void insertSort(int array[]) {
        int length = array.length;
        for (int i = 1; i < length; i++) {
            int temp = array[i];
            if (array[i] < array[i - 1]) {
                int j = i - 1;
                //移出插入位置
                while (temp < array[j]) {
                    array[j + 1] = array[j];
                    j--;
                    if (j < 0) {
                        break;
                    }
                }
                array[j + 1] = temp;
            }
        }
    }


    /**
     * 1、首先比较数组的前两个数据，并排序；
     * 　2、比较第三个元素与前两个排好序的数据，并将第三个元素放入适当的位置；
     * 　3、比较第四个元素与前三个排好序的数据，并将第四个元素放入适当的位置；
     * 　 ......
     * 　4、直至把最后一个元素放入适当的位置。
     *
     * @param array
     */
    public static void directSort(Integer array[]) {
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
            array[j + 1] = temp;
        }
    }

    /**
     * 二分插入排序算法（shell）
     * 设有一个序列a[0],a[1]...a[n];其中a[i-1]前是已经有序的,当插入时a[i]时,利用二分法搜索a[i]插入的位置
     * 先将整个待排序的记录序列分割成为若干子序列分别进行直接插入排序，待整个序列中的记录“基本有序”时，再对全体记录进行依次直接插入排序。
     * 1 选择一个增量序列t1，t2，…，tk，其中ti>tj，tk=1；
     * 2 按增量序列个数k，对序列进行k 趟排序；
     * 3 每趟排序，根据对应的增量ti，将待排序列分割成若干长度为m 的子序列，分别对各子表进行直接插入排序。仅增量因子为1 时，整个序列作为一个表来处理，表长度即为整个序列的长度。
     *
     * @param array
     */
    public static void shellSort(int[] array) {
        if (array == null) {
            return;
        }
        int dk = array.length / 2;
        while (dk >= 1) {
            shellINsertSort(array, dk);
            dk = dk / 2;
        }
    }

    public static void shellINsertSort(int array[], int dk) {
        int n = array.length;
        for (int i = dk; i < n; ++i) {
            if (array[i] < array[i - dk]) {
                int j = i - dk;
                int x = array[i];
                array[i] = array[i - dk];
                while (x < array[j]) {
                    array[j + dk] = array[j];
                    j -= dk;
                    if (j < 0) break;
                }
                array[j + dk] = x;
            }
        }
    }
     //默写希尔排序
    public static void shellSort(int array[],int dk){
        for(int i=dk;i<array.length;i=i+1){
            int temp=array[dk];
            int j=dk-1;
            if(array[i]<array[i-dk]){
              while (temp<array[j]){
                  array[j+dk]=array[j];
                  j-=dk;
              }
              array[j+dk]=temp;
            }
        }

    }
    /**
     * 简短选择排序 ；在要排序的一组数中，选出最小（或者最大）的一个数与第1个位置的数交换；然后在剩下的数当中再找最小
     * （或者最大）的与第2个位置的数交换，依次类推，
     * 直到第n-1个元素（倒数第二个数）和第n个元素（最后一个数）比较为止。
     *
     * @param array
     */

    public static void selectSort(int[] array) {
        int n = array.length;
        for (int i = 0; i < n; i++) {
            int k = selectMinIndex(array, i);
            if (k != i) {
                int temp = array[i];//拷贝副本
                array[i] = array[k];//交换位置
                array[k] = temp;
            }
            println(array);
        }
    }


    public static int selectMinIndex(int array[], int start) {
        int k = start;
        for (int j = start + 1; j < array.length; j++) {
            if (array[k] > array[j]) k = j;
        }
        return k;
    }


    /**
     * 堆排序：堆排序是一种树形选择排序，是对直接选择排序的有效改进。
     * 基本思想：
     * 堆的定义如下：具有n个元素的序列（k1,k2,…,kn),当且仅当满足
     * ki<=k2i
     * ki<=k(2i+1)
     * 或者
     * ki>=k2i
     * ki>=K(2i+1)
     * k=(1......2/n)
     * 输出堆顶元素后，对剩余n-1元素重新建成堆的调整过程。
     * 调整小顶堆的方法：
     * 1）设有m 个元素的堆，输出堆顶元素后，剩下m-1 个元素。将堆底元素送入堆顶（（最后一个元素与堆顶进行交换），堆被破坏，其原因仅是根结点不满足堆的性质。
     * 2）将根结点与左、右子树中较小元素的进行交换。
     * 3）若与左子树交换：如果左子树堆被破坏，即左子树的根结点不满足堆的性质，则重复方法 （2）.
     * 4）若与右子树交换，如果右子树堆被破坏，即右子树的根结点不满足堆的性质。则重复方法 （2）.
     * 5）继续对不满足堆性质的子树进行上述交换操作，直到叶子结点，堆被建成。
     * <p>
     * 建堆方法：对初始序列建堆的过程，就是一个反复进行筛选的过程。
     *
     * @param array  被调整的数据
     * @param s      要调整的位置
     * @param length 数组长度
     *               <p>
     *               大顶堆
     */
    //调整一个大推
    private static void heapAdjust(int array[], int s, int length) {
        int temp = array[s];
        int child = s * 2 + 1;
        while (child < length) {
            //右孩子左孩子,确定到底调整左节点还是右节点。
            if (child + 1 < length && array[child] < array[child + 1]) {
                child++;
            }
            //调整节点小于子节点
            if (array[s] < array[child]) {
                array[s] = array[child];//更新下一个调整位置
                s = child;
                child = 2 * s + 1;
            } else {
                break;
            }
            array[s] = temp;
        }
    }

    /**
     * 初始化对
     *
     * @param array
     */
    private static void initHeap(int array[]) {
        for (int i = (array.length - 1) / 2; i >= 0; --i) {
            heapAdjust(array, i, array.length);
        }
    }

    private static void heapSort(int array[]) {
        initHeap(array);
        for (int i = array.length - 1; i > 0; i--) {
            int temp = array[i];
            array[i] = array[0];
            array[0] = temp;
            heapAdjust(array, 0, i);
        }
    }


    public static void main(String[] args) {
        int[] array = {3, 1, 5, 7, 2, 4, 9, 6, 10, 8};
        insertSort(array);
        println(array);
        //insertSort(array, array.length);
        // shellSort(a);
        // selectSort(a);
        // heapSort(array);
    }

    public static void println(int[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + ", ");
        }
        System.out.print("\n");
    }



}
