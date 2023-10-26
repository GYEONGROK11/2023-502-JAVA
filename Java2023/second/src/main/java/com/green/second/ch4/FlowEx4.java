package com.green.second.ch4;

public class FlowEx4 {
    public static void main(String[] args) {
        ScoreBox sb1 = new ScoreBox(79);
        ScoreBox sb2 = new ScoreBox(100);

        sb1.printGrade();
        sb2.printGrade();
    }
}

class ScoreBox {
    private int score;

    public ScoreBox(int score) {
        this.score = score;
    }

    public int getScore() {
        return score;
    }
    //static 인스턴스멤버필드를 사용하지 않을때, 객체생성을 하지 않을때
    public void printGrade() {
        String grade = "D";
        String opt = "";


        if (score >= 90) {
            grade = "A";

        } else if (score >= 80) {
            grade = "B";

        } else if (score >= 70) {
            grade = "C";

        }

        System.out.printf("%s%s학점\n", grade, opt);

    }

}