/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author justi
 */
public class Freshman extends Student {
    
    
    
    // Default constructor
    public Freshman() {
        this("-No name-", (short) 0, 0);
    }
    
    // Constructor with params
    public Freshman(String name, int age, int credits) {
        super(name, (short) age, credits);
    }

    
    
    @Override
    public String toString() {
        return "-Student Info-" 
                + "Name: " + name
                + "Age: " + age
                + "Address: " + address
                + "Credits: " + credits;
    }
}
