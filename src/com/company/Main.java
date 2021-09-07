package com.company;

public class Main {

    public static void main(String[] args) {
        int hour = 18;
        int minute = 43;
        int second = 42;
        System.out.println("Number of seconds since midnight: "+(hour*60*60+minute*60+second));
        int SinceMidnight = (hour*60*60+minute*60+second);
        int SecondsDay = 24*60*60;
        System.out.println("Number of seconds remaining in the day: "+(SecondsDay-SinceMidnight));
        System.out.println("Percent of the day that has passed: "+(SinceMidnight*100/SecondsDay));
        int hourEnd = 19;
        float minuteEnd = 31;
        float secondEnd = 14;
        System.out.println("Seconds spend doing this exersice: "+(hourEnd*60*60+minuteEnd*60+secondEnd-SinceMidnight));
        System.out.print("Percent of the day spent doing this exersice. "+((hourEnd*60*60+minuteEnd*60+secondEnd-SinceMidnight)*100/SecondsDay));
    }
}
