/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author justi
 */
public class Senior extends Student {
    
    private int credits;
    
    // Default constructor
    public Senior() {
        this("-No name-", (short) 0, 85);
    }
    
    // Constructor with params
    public Senior(String name, int age, int credits) {
        super(name, (short) age);
        this.credits = credits;
    }

    // Mutator and accessor methods for 'credits' attribute
    public int getCredits() {
        return credits;
    }

    // Minimum bound of 85 for 'credit' value
    public boolean setCredits(int credits) {
        if (credits < 85) 
            return false;
        
        this.credits = credits;
        return true;
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
