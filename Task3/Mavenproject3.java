/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mireatest.mavenproject3;

/**
 *
 * @author Ya
 */
import java.util.Scanner;


public class Mavenproject3 {

    public static void main(String[] args) {
    System.out.println("Вариант 2, РИБО-03-21, Берсенев Ярослав");
    Scanner myObj = new Scanner(System.in);
    
    System.out.println("What ringtone? ");
    String ringtone = myObj.nextLine();
    
    System.out.println("What number? ");
    String number = myObj.nextLine();
    
    System.out.println("What model? ");
    String model = myObj.nextLine();
    
	Telephone phone = new Telephone(ringtone, number, model);
	Seller seller = new Seller();
	seller.modify(phone);
	System.out.println(phone.toString());
    }
}

