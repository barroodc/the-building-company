package com.solvd.thebuildingcompany.utils;

import java.util.concurrent.locks.Lock;
import java.util.concurrent.locks.ReentrantLock;

public class DeadLock {


    public static void main(String[] args) {
       Lock participantA = new ReentrantLock();
       Lock participantB = new ReentrantLock();
       Lock participantC = new ReentrantLock();
       new Philosopher("Chris",participantA,participantB).start();
       new Philosopher("Ilissa",participantB, participantC).start();
       new Philosopher("Brianna",participantA, participantC).start();
    }
}
