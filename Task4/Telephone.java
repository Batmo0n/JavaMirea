/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mireatest.mavenproject4;

/**
 *
 * @author user
 */
public class Telephone {
    private String model;
    private String color;
    private String serial;
    private boolean mobile;

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    public String getSerial() {
        return serial;
    }

    public void setSerial(String serial) {
        this.serial = serial;
    }

    public Telephone(String model, String color, String serial, boolean mobile) {
        this.model = model;
        this.color = color;
        this.serial = serial;
        this.mobile = mobile; 
    }

    @Override
    public String toString() {
        return model + " " + color + " " + serial + " " + mobile;
    }
}
