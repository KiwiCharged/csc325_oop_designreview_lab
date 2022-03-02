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
    
    // Default constructor
    public Senior() {
        this("-No name-", (short) 0, 85);
    }
    
    // Constructor with params
    public Senior(String name, int age, int credits) {
        super(name, (short) age, credits);
    }

    // Minimum bound of 85 for 'credit' value
    @Override
    public void setCredits(int credits) {
        if (credits < 85) 
            return;
        
        this.credits = credits;
    }
    
    @Override
    public String toString() {
        return super.toString() + "\nGrade level: " + "Senior\n";
    }
}
