package com.green.day9.ch5;

public class ArrayEx19 {
    public static void main(String[] args) {
        /*
        국영수 점수
        번호  국어  영어  수학  총점  평균.1f
        1     ?     ?     ?     ?     ?
        2     ?     ?     ?     ?     ?
        합계   ?     ?     ?     ?     ?
         */
        int[][] score = {
                {101, 102, 103},
                {21, 22, 23},
                {31, 32, 33},
                {41, 42, 43},
                {51, 52, 53}
        };
        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");

        for (int i = 0; i < score.length; i++) {
            int sum = 0;
            System.out.printf("%d\t", i + 1);
            for (int z = 0; z < score[i].length; z++) {
                System.out.printf("%d\t", score[i][z]);
                sum += score[i][z];
            }
            System.out.printf("%d\t", sum);
            System.out.printf("%.1f\t", (float) sum / score[i].length);
            System.out.println();
        }


        System.out.print("합계\t");
        for (int i = 0; i < score[i].length; i++) {
            int sum = 0;
            for (int z = 0; z < score.length; z++) {
                sum += score[z][i];

            }
            System.out.printf("%d\t", sum);
        }
    }
}

class ArrayEx19Result {
    public static void main(String[] args) {
        int[][] score = {
                { 101, 102, 103 }
                , {  21,  22,  23 }
                , {  31,  32,  33 }
                , {  41,  42,  43 }
                , {  51,  52,  53 }
        };
        int[] sumArr = new int[score[0].length];

        System.out.println("번호\t국어\t영어\t수학\t총점\t평균");
        System.out.println("----------------------------------");
        for(int i = 0; i< score.length; i++) {
            System.out.printf("%d", i+1);
            int sum = 0;
            for(int z = 0; z < score[i].length; z++) {
                int val = score[i][z];
                sumArr[z] += val;
                sum += val;
                System.out.printf("\t%d", val);
            }
            float avg = (float)sum / score[i].length;
            System.out.printf("\t%d\t%.1f\n", sum, avg);
        }
        System.out.println("----------------------------------");
        System.out.print("총점");
        for(int val : sumArr) {
            System.out.printf("\t%d", val);
        }
        System.out.println();

    }
}
