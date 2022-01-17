package day01;

import java.time.LocalDate;

public class RunningItem {

    private double distance;
    private LocalDate timeOfRunning;

    public RunningItem(double distance, LocalDate timeOfRunning) {
        this.distance = distance;
        this.timeOfRunning = timeOfRunning;
    }

    public double getDistance() {
        return distance;
    }

    public LocalDate getTimeOfRunning() {
        return timeOfRunning;
    }
}
