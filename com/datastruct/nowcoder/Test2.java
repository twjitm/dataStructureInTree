package com.datastruct.nowcoder;

import com.datastruct.sort.ExchangeSorts;

import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by 文江 on 2017/8/21.
 */
public class Test2 {

    private static String test(Integer[] array) {
        //  Arrays.sort(array);
    /*     for (int i = 0; i < array.length - 1; i++) {
            for (int j = 0; j < array.length - i - 1; j++) {
                int temp = array[i];
                if (array[i] > array[j]) {
                    array[j] = array[i];
                    array[i] = temp;
                }
            }
        }*/
        ExchangeSorts.bubbleSort(array);
        System.out.println(Arrays.toString(array));
        boolean possible = true;
        for (int i = 0; i < array.length; i = i + 3) {
            if (array[i] + array[i + 1] != array[i + 2]) {
                possible = false;
            }
        }
        return possible ? "Possible" : "Impossible";
    }

    public static void main(String[] args) {
        Integer[] a = {3, 1, 2};
        System.out.println(test(a));
    }


    public int zoreOneStr(String req) {
        Scanner sc = new Scanner(System.in);
        char[] chars = req.toCharArray();
        int num = 0;
        char concurr = '0';
        for (int i = 0; i < chars.length - 1; i++) {


        }
        return 0;
    }

    public void test1(Integer[] array) {
        Integer[] b = new Integer[array.length];
        for (int i = 0; i < array.length; i++) {
            domain(b, i, array[i]);
        }
    }

    private void domain(Integer[] b, int i, Integer value) {
        b[i] = value;
        for (int j = 0; j <= i; j++) {
            while (i == j) {

            }
        }
    }
}
