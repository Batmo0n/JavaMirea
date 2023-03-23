/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mireatest.mavenproject4;

import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author user
 */
public class Mavenproject4 {

    public static void main(String[] args) {
        System.out.println("Вариант 2, РИБО-03-21, Берсенев Ярослав");
        Scanner myObj = new Scanner(System.in);
        ArrayList<Telephone> list = new ArrayList<>();
        list.add(new Telephone("Apple", "red", "123qwe", true));
        list.add(new Telephone("Samsung", "white", "456rty", false));
        list.add(new Telephone("Panasonic", "Black", "789uio", true));
        while (true){
            System.out.println("=================================");
            for (Telephone phone: list){
                    System.out.println(phone.toString());
                }
            System.out.println("=================================");
            System.out.println("action: new, delete, clear, exit");
            String action = myObj.nextLine();
            System.out.println("------------------------------------");
            switch (action) {
                case "new":
                    {
                        System.out.println("What model? ");
                        String model = myObj.nextLine();
                        System.out.println("What color? ");
                        String color = myObj.nextLine();
                        System.out.println("What serial? ");
                        String serial = myObj.nextLine();
                        boolean isExist = false;
                        for (Telephone phone: list){
                            if(serial.equals(phone.getSerial())){
                                isExist = true;
                            }
                        }
                        System.out.println("Mobile: yes or no? ");
                        String mobileAsk = myObj.nextLine();
                        boolean mobile = false;
                        if (mobileAsk.equals("yes")){
                            mobile = true;
                        }
                        if (isExist==true){
                            System.out.println("Такой серийник уже есть");
                            break;
                        }
                        else {
                            list.add(new Telephone(model,color,serial,mobile));
                        }
                        break;
                    }
                case "delete":
                    {
                        System.out.println("What serial? ");
                        String serial = myObj.nextLine();
                        ArrayList<Telephone> tempList = new ArrayList<>(list);
                        for (Telephone phone: list){
                            if (serial.equals(phone.getSerial())){
                                tempList.remove(phone);
                            }
                        }
                        list=tempList;
                        break;
                    }
                case "clear":
                    list.clear();
                    break;
                case "exit":
                    System.out.println("Выхода нет ха-ха");
                    break;
                default:
                    break;
            }
        }
    }
}
