package com.company;

public class Theatre {

    private static int numberOfBooths;
    private static int occupiedBooths;


    public Theatre() {
    }

    public synchronized static int getNumberOfBooths() {
        return numberOfBooths;
    }

    public static synchronized void setNumberOfBooths(int numberOfBooths) {
        Theatre.numberOfBooths = numberOfBooths;
    }

    public static synchronized int getOccupiedBooths() {
        return occupiedBooths;
    }

    public static synchronized void setOccupiedBooths(int occupiedBooths) {
        Theatre.occupiedBooths = occupiedBooths;
    }
}
