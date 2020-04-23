package com.company;

import static java.lang.Thread.sleep;

public class Guest implements Runnable {

    private String name;
    private int walkDuration;
    private int buyDuration;

    public void run() {
        buyTicket();
    }

    public synchronized void buyTicket() {
        System.out.println("Guest " + this + " will try to buy the ticket if there are unoccupied booths.");
        if (Theatre.getOccupiedBooths() < Theatre.getNumberOfBooths()) {

            Theatre.setOccupiedBooths(Theatre.getOccupiedBooths() + 1);
            try {
                System.out.println("Transaction started for guest " + this + ".");
                for (int i = 0; i < this.getBuyDuration(); i = i + 1000) {
//                    System.out.println("Transaction in progress. Current duration: " + i / 1000 + " seconds.");
                    sleep(1000);
                }
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println("Transaction finished for guest " + this + ". Transaction lasted " + this.getBuyDuration() / 1000 + " seconds");
            Theatre.setOccupiedBooths(Theatre.getOccupiedBooths() - 1);
        } else {
            System.out.println("There are no free booths for now, guest " + this + " is taking a walk while waiting.");
            walk();
            buyTicket();
        }

    }

    public synchronized void walk() {
        for (int i = 0; i < walkDuration; i = i + 1000) {
//            System.out.println("Guest " + this + " has been walking for " + i / 1000 + " seconds.");
            try {
                sleep(1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        System.out.println("Guest " + this + " has finished the walk.");
    }

    public Guest() {
    }

    public Guest(String name, int walkDuration, int buyDuration) {
        this.name = name;
        this.walkDuration = walkDuration;
        this.buyDuration = buyDuration;
    }

    public int getWalkDuration() {
        return walkDuration;
    }

    public void setWalkDuration(int walkDuration) {
        this.walkDuration = walkDuration;
    }

    public int getBuyDuration() {
        return buyDuration;
    }

    public void setBuyDuration(int buyDuration) {
        this.buyDuration = buyDuration;
    }

    public String getGuestName() {
        return name;
    }

    public void setGuestName(String name) {
        this.name = name;
    }

    @Override
    public String toString() {
        return name;
    }


}
