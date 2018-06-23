package datastruct.test;

public class TestMaxvalue {
    public static void main(String[] args) {
        int[] array = {1, 3, -2, 4, -5};
        int result = getAddMaxValue(array);
        System.out.println(result + ":" + maxValue(array));
    }

    public static int getAddMaxValue(int[] array) {
        int maxSum = 0;
        for (int start = 0; start < array.length; start++) {
            for (int end = start; end < array.length; end++) {
                int thisSum = 0;
                for (int index = start; index < end; index++) {
                    thisSum += array[index];
                }
                if (maxSum < thisSum) {
                    maxSum = thisSum;
                }
            }
        }

        return maxSum;
    }


    public static int maxValue(int array[]) {
        int maxsum, maxhere;
        maxhere = maxsum = 0;

        for (int i = 0; i < array.length; i++) {
            if (maxhere < 0) {
                maxhere = array[i];
            } else {
                maxhere += array[i];
            }
            if (maxhere > maxsum) {
                maxsum = maxhere;
            }
        }
        return maxsum;
    }

    public int count(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return count(n - 1) + count(n - 2);
    }

}
