package com.solvd.thebuildingcompany.utils;

public class DeadLock {


    public static void main(String[] args) {
      final Worker josh = new Worker("Josh");
      final Worker peter = new Worker("Peter");
      new Thread(() -> josh.beginMorningShift(peter)).start();
      new Thread(() -> peter.beginNightShift(josh)).start();
    }
}
