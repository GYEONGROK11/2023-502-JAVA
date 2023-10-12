package com.green.day11.ch6;

public class MethodExam2 {

    String scoreResultOpt(int n){
        String grade = "D";
        String opt = "0";
        if(n<0 ||n>100){
            return "점수를 확인하세요";
        }

        int modVal = n%10;
        if(n>=90){
            grade ="A";
            if(modVal>=8||n==100){
                opt = "+";
            }else if(modVal<=3){
                opt = "-";
            }
        } else if(n>=80){
            grade ="B";
            if(modVal>=8){
                opt = "+";
            }else if(modVal<=3){
                opt = "-";
            }
        } else if(n>=70){
            grade ="C";
            if(modVal>=8){
                opt = "+";
            }else if(modVal<=3){
                opt = "-";
            }
        } return grade+opt+"학점";
    }
    String scoreResultOpt1(int n){
        String grade = "D";
        if(n==100){
            return "A+학점";
        }else if(n<70){
            return "D학점";
        }else if(n>=90){
            grade = "A";
        }else if(n>=80){
            grade = "B";
        }
        String opt = "0";
        int modVal = n%10;
        if(modVal>=8){
            opt = "+";
        }else if(modVal<=3){
            opt = "-";
        }

      return grade+opt+"학점";
    }

}
