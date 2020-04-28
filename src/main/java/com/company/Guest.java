package com.company;

public class Guest extends Thread {

  /** konstruktor */
  public Guest(String name, Theatre theatre) {
    this.name = name;
    this.theatre = theatre;
  }

  /** opisuje ponasanje gosta */
  public void run() {
    int counterIndex =  theatre.approachCounter(this);
    while(counterIndex == -1){
      counterIndex = theatre.approachCounter(this);
    }
    try {
      System.out.println("Guest " + name + " is taking a walk.");
      sleep((long) (Math.random() * 1000));
      System.out.println("Guest " + name + " is buying a ticket.");
      sleep((long) (Math.random() * 1000));
    } catch (InterruptedException e) {
      e.printStackTrace();
    }
    theatre.leaveCounter(this,counterIndex);
  }

  /** ime gosta */
  public String name;

  /** pozoriste u koje se ide */
  private Theatre theatre;

}