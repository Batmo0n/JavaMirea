/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mireatest.mavenproject3;

/**
 *
 * @author Ya
 */

public class Seller {
	public Seller(){
	}	
	
	public void modify(Telephone phone){
		String model = phone.getModel();
		model = model.replace("o", "a");
		if (model.charAt(0) != 'n' || model.charAt(0) != 'N'){
			model = model.toUpperCase();
		phone.setModel(model);
		}
	}
}
