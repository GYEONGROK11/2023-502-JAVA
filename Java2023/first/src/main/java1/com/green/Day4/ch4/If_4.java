package com.green.Day4.ch4;

public class If_4 {
    public static void main(String[] args) {
        //50~200 사이 랜덤값
        //100이하면 그 값의 *2한 결과값
        //100초과면 그 값의 +10한 결과값
        //    0< Math.random() <151
        int val = (int)(Math.random()*151)+50;
        if(val>100){
            //System.out.print(val+10);
            System.out.printf("%d=%d",val,val+10);
        } else{
            //System.out.println(val*2);
            System.out.printf("%d=%d",val,val*2);

            /*System.out.printf("val"+val);*/
        }
    }
}
