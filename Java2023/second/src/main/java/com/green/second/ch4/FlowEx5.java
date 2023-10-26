package com.green.second.ch4;

public class FlowEx5 {
    public static void main(String[] args) {
        ScoreBoxOpt sbo1 = new ScoreBoxOpt();
        sbo1.setScore(100);
        ScoreBoxOpt sbo2 = new ScoreBoxOpt();
        sbo2.setScore(72);

        String grade1 = sbo1.getGrade();
        String grade2 = sbo2.getGrade();
        System.out.println(grade1);
        System.out.println(grade2);

    }
}

class ScoreBoxOpt {
    private int score;
    private String grade;

    public void setScore(int score) {
        if(score < 100 || score > 0){
        this.score = score;}
        else {
            System.out.println("잘못된점수");}
    }

    public String getGrade() {
        String grade = "C";
        String opt = "0";

        if (score >= 90) {
            grade = "A";
        } else if (score >= 80) {
            grade = "B";
        }

        if (score >= 80) {
            if (score % 10 >= 8 || score == 100) {
                opt = "+";
            } else if (score % 10 <= 3) {
                opt = "-";
            }
        }
        return grade + opt;
    }
}