/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mriea.mavenproject7;
import java.util.concurrent.Semaphore;

/**
 *
 * @author user
 */
public class Mavenproject7 {

    public static void main(String[] args) {
        System.out.println("Вариант 2, РИБО-03-21, Берсенев Ярослав");
        Semaphore sem = new Semaphore(2);
        for (int i = 1; i <= 7; i++) {
            Thread t = new Student(i, sem);
            t.start();
        }
    }
}
