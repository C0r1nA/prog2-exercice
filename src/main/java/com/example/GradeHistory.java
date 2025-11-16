package com.example;
import java.time.LocalDateTime;

public class GradeHistory {
    private double oldValue;
    private double newValue;
    private LocalDateTime changeDateTime;
    private String reason

    public GradeHistory(double oldValue, double newValue, LocalDateTime changeDateTime, String reason) {
        this.oldValue = oldValue;
        this.newValue = newValue;
        this.changeDateTime = changeDateTime;
        this.reason = reason;
    }

    public double getOldValue() {
        return oldValue;
    }

    public double getNewValue() {
        return newValue;
    }

    public LocalDateTime getTimestamp() {
        return timestamp;
    }

    public String getReason() {
        return reason;
    }
}
