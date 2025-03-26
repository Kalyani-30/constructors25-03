package com.neoteric.variable.hospitalappointments;

import java.time.LocalTime;

public class DurationTime {
    private LocalTime startTime;
    private LocalTime endTime;

    public DurationTime(LocalTime startTime, LocalTime endTime) {
        this.startTime = startTime;
        this.endTime = endTime;
    }

    public LocalTime getStartTime() {
        return startTime;
    }

    public LocalTime getEndTime() {
        return endTime;
    }

    @Override
    public String toString() {
        return "DurationTime{" +
                "startTime=" + startTime +
                ", endTime=" + endTime +
                '}';
    }
}
