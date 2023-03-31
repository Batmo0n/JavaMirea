/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mirea.kt.example;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class KtExample {

    public static void main(String[] args) {
        System.out.println("Вариант 2, РИБО-03-21, Берсенев Ярослав");
        Scanner scanner = new Scanner(System.in);
        System.out.print("put' do fayla: ");
        String filePath = scanner.nextLine();
        Thread thread = new Thread(new DeserializeThread(filePath));
        thread.start();
    }
}
