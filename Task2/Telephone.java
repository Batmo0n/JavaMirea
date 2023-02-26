/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mireatest.mavenproject1;

/**
 *
 * @author user
 */
public class Telephone {
    private String ringtone;
    private String phoneNumber;
    private String model;

    public Telephone(String ringtone, String phoneNumber, String model) {
        this.ringtone = ringtone;
        this.phoneNumber = phoneNumber;
        this.model = model;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getRingtone() {
        return ringtone;
    }

    public void setRingtone(String ringtone) {
        this.ringtone = ringtone;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }
    
    public void callFriend(String friendNumber) {
        System.out.println(phoneNumber+ " calling "+ friendNumber);
    }
    public void listenRingtone() {
        System.out.println("That "+ ringtone+" hits so hard");
    }
    public void pressRndButtons() {
        System.out.println("Beep Beep Boop Boop Beep Boop");
    }

    @Override
    public String toString() {
        return "ringtone= " + ringtone + ", phoneNumber= " + phoneNumber + ", model= " + model;
    }
    
}
