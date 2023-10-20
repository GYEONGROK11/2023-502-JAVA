package extra.day2;

import java.util.Arrays;

public class Utils {
    public static int abs(int num) {
        return num < 0 ? -num : num;
    }
    public static int sumArr(int[] arr){
        int sum = 0;
        for ( int a : arr) {
            sum += a;
        }
        return sum;
    }
    public static int[] mapPlus(int[] arr, int num){
        int[] tmp = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            tmp[i] = arr[i];
            tmp[i] += num;
        }
        return tmp;
    }
}

class UtilsTest {
    public static void main(String[] args) {
        int r = Utils.abs(-10);
        System.out.println("r : " + r);
        System.out.println("r2 : " + Utils.abs(-9));
        System.out.println("r3 : " + Utils.abs(8));

        int[] intArr = {10,12,13,14,5};
        int sum = Utils.sumArr(intArr);
        System.out.println(sum);

        int[] rArr = Utils.mapPlus(intArr,5);
        System.out.println(Arrays.toString(intArr));
        System.out.println(Arrays.toString(rArr));
    }
}