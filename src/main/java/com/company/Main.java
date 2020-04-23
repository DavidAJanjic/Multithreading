package com.company;

public class Main {

    public static void main(String[] args) {

        Theatre.setNumberOfBooths(2);
        Theatre.setOccupiedBooths(0);
        Guest guest1 = new Guest("David", 10000, 6000);
        Guest guest2 = new Guest("Ana", 5000, 4000);
        Guest guest3 = new Guest("Nikola", 8000, 2000);
        Guest guest4 = new Guest("Gorcin", 7000, 3000);
        Thread thread1 = new Thread(guest1);
        Thread thread2 = new Thread(guest2);
        Thread thread3 = new Thread(guest3);
        Thread thread4 = new Thread(guest4);

        thread1.start();
        thread2.start();
        thread3.start();
        thread4.start();


    }
}
