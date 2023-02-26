/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mireatest.mavenproject1;

/**
 *
 * @author user
 */
public class MobilePhone extends Telephone {
    private int pixelWidth;
    private int pixelHeight;
    private int diagonal;

    public MobilePhone(int width, int height, int diagonal, String ringtone, String phoneNumber, String model) {
        super(ringtone, phoneNumber, model);
        this.pixelWidth = width;
        this.pixelHeight = height;
        this.diagonal = diagonal;
    }

    public int getWidth() {
        return pixelWidth;
    }

    public void setWidth(int width) {
        this.pixelWidth = width;
    }

    public int getHeight() {
        return pixelHeight;
    }

    public void setHeight(int height) {
        this.pixelHeight = height;
    }

    public int getDiagonal() {
        return diagonal;
    }

    public void setDiagonal(int diagonal) {
        this.diagonal = diagonal;
    }
    
    public void playSnake(){
        System.out.println("It's fun");
    }
    
    public void showFriend(){
        System.out.println("Wow your "+ this.getModel()+ " is so cool");
    }
    
    public void watchVideos(){
        System.out.println("I love to watch videos on my "+ pixelHeight+"x"+pixelWidth+" screen");
    }

    @Override
    public String toString() {
        return "width= " + pixelWidth + ", height= " + pixelHeight + ", diagonal= " + diagonal
                + ", ringtone= " + getRingtone() + ", phoneNumber= " + getPhoneNumber() + ", model= " + getModel();
    }
    
}
