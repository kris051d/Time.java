package com.company;

public class Main {

    public static void main(String[] args) {
        int hour = 18;
        int minute = 43;
        int second = 42;
        System.out.print("Number of seconds since midnight: ");
        System.out.println(hour*60*60+minute*60+second);
        int SinceMidnight = (hour*60*60+minute*60+second);
        int SecondsDay = 24*60*60;
        System.out.print("Number of seconds remaining in the day: ");
        System.out.println(SecondsDay-SinceMidnight);
        System.out.print("Percent of the day that has passed: ");
        System.out.println(SinceMidnight*100/SecondsDay);
        int hourEnd = 19;
        double minuteEnd = 31;
        double secondEnd = 14;
        System.out.print("Seconds spend doing this exersice: ");
        System.out.println(hourEnd*60*60+minuteEnd*60+secondEnd-SinceMidnight);
        System.out.print("Percent of the day spent doing this exersice. ");
        System.out.print((hourEnd*60*60+minuteEnd*60+secondEnd-SinceMidnight)*100/SecondsDay);
    }
}
