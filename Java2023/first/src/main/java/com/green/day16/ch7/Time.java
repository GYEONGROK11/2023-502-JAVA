package com.green.day16.ch7;

public class Time {
    private final int MAX_HOUR = 23;
    private final int MIN_HOUR = 0;
    private int hour, minute, second;

    public Time() {
    }
    //1 생성자를 이용한 값 넣기
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //2 메소드를 이용한 값 넣기
    //setter 메소드
    public void setHour(final int hour) {
        if (hour > MAX_HOUR) {
            this.hour = MAX_HOUR;
            return;
        }
        if (hour < MIN_HOUR) {
            this.hour = MIN_HOUR;
            return;
        }
        this.hour = hour;
    }
    public void setMinute(int minute) {
        this.minute = minute;
    }
    public void setSecond(int second) {
        this.second = second;
    }
    //메소드를 이용한 값을 뺀다
    //getter 메소드
    public int getHour() {
        return this.hour;
    }
    public int getMinute() {
        return this.minute;
    }
    public int getSecond() {
        return this.second;
    }
}

class TimeTest {
    public static void main(String[] args) {
        //time.hour =10;
        Time time = new Time(10, 20, 30);
        System.out.println(time);
        time.setHour(26);
        time.setMinute(1);
    }
}