package com.epam.kaliada.classes.simplestclasses.task6;

public class TimeCreator {
    public static final int SECONDS_IN_MINUTE = 60;
    public static final int MINUTES_IN_HOUR = 60;

    public Time createTime(int hours, int minutes, int seconds){
        hours = Math.max(hours, 0);
        minutes = Math.max(minutes, 0);
        seconds = Math.max(seconds, 0);
        minutes += seconds / SECONDS_IN_MINUTE;
        seconds %= SECONDS_IN_MINUTE;
        hours += minutes / MINUTES_IN_HOUR;
        minutes %= MINUTES_IN_HOUR;
        return new Time(hours, minutes, seconds);
    }
    public Time changeTimeByHours(Time time, int hours){
        int modifiedHours = Math.max(time.getHours() + hours, 0);
        time.setHours(modifiedHours);
        return time;
    }
    public Time changeTimeByMinutes(Time time, int minutes){
        int modifiedMinutes = Math.max(time.getMinutes() + minutes, 0);
        if (modifiedMinutes >= 60){
            time.setHours(time.getHours() + modifiedMinutes / MINUTES_IN_HOUR);
            time.setMinutes(modifiedMinutes % MINUTES_IN_HOUR);
        }else {
            time.setMinutes(modifiedMinutes);
        }
        return time;
    }
    public Time changeTimeBySeconds(Time time, int seconds){
        int modifiedSeconds = Math.max(time.getSeconds() + seconds, 0);
        if (modifiedSeconds >= 60){
            time.setMinutes(time.getMinutes() + modifiedSeconds / SECONDS_IN_MINUTE);
            time.setSeconds(modifiedSeconds % SECONDS_IN_MINUTE);
            if (time.getMinutes() >= 60){
                time.setHours(time.getHours() + time.getMinutes()/ MINUTES_IN_HOUR);
                time.setMinutes(time.getMinutes() % MINUTES_IN_HOUR);
            }
        }else {
            time.setSeconds(modifiedSeconds);
        }
        return time;
    }
}
