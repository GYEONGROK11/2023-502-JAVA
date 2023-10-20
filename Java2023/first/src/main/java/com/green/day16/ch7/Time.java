package com.green.day16.ch7;

public class Time {
    private final int MAX_HOUR = 23;
    private final int MIN_HOUR = 0;
    private int hour, minute, second;

    public Time() {
    }
    //private로 선언된 멤버필드의 값을 수정할때
    //1 생성자를 이용한 값 넣기
    public Time(int hour, int minute, int second) {
        this.hour = hour;
        this.minute = minute;
        this.second = second;
    }
    //2 메소드를 이용하여 값 넣기
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
    }//값을 리턴할 필요가 없어서 보이드 메소드
    public void setSecond(int second) {
        this.second = second;
    }
    //메소드를 이용하여 값을 뺀다
    //getter 메소드
    public int getHour() {
        return this.hour;
    } //리턴타입은 정해짐, 파라미터 정보가없음
    public int getMinute() {
        return this.minute;
    }
    public int getSecond() {
        return this.second;
    }
    @Override
    public String toString(){
        return String.format("%02d:%02d:%02d",hour,minute,second);
    }
}

class TimeTest {
    public static void main(String[] args) {
        //time.hour =10;
        Time time = new Time(10, 20, 30);
        System.out.println(time);
        time.setHour(26);
        time.setMinute(1);
        System.out.println(time);
    }
}