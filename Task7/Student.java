/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mriea.mavenproject7;

import java.util.concurrent.Semaphore;

/**
 *
 * @author user
 */
class Student extends Thread {

    private int id;
    private Semaphore sem;

    public Student(int id, Semaphore sem) {
        this.id = id;
        this.sem = sem;
    }

    @Override
    public void run() {
        try {
            System.out.println("Student" + id + " waiting");
             sem.acquire();
            System.out.println("Student" + id + " eating");
            Thread.sleep(1000);
            System.out.println("Student" + id + " exiting");
            sem.release();
            
        } catch (InterruptedException e) {
        }
    }
}
