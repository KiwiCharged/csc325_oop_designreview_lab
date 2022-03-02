
package com.mycompany.csc325_oop_designreview_lab;

/**
 *
 * @author MoaathAlrajab
 */
/**
 *
 * @author MoaathAlrajab
 */
public class Student extends Human {
	// ToDo 1: [DONE] Make this class a child of Human
	
	// ToDo 2: [DONE] Fix the resulting errors
	
	// ToDo 3: [DONE] Add a field for GPA and create setter and getter
	
	// ToDo 4: [DONE] Add comments to your code

    protected double gpa;
    protected int credits;
    
    // Default constructor
    public Student() { 
        this("-No Name-", (short) 0, 0);
    }
    
    // Constructor with params
    public Student(String name, int age, int credits) {
        super(name, (short) age);
        this.credits = credits;
        address = "-No current address-";
    }
    
    // Mutator and accessor methods for 'gpa' attribute
    public void setGpa(double gpa) {
        this.gpa = gpa;
    }

    public double getGpa() {
        return gpa;
    }
    
    // Mutator and accessor methods for 'credits' attribute
    public int getCredits() {
        return credits;
    }

    public void setCredits(int credits) {
        this.credits = credits;
    }

    // Mutator and accessor methods for 'address' attribute
    @Override
    public String getAddress() {
        return address;
    }

    @Override
    public void setAddress(String address) {
        this.address = address;
    }
    
    // ToString with all attributes of current class and parent class
    @Override
    public String toString() {
        return "-Student Info-" 
                + "\nName: " + name
                + "\nAge: " + age
                + "\nAddress: " + address
                + "\nGPA: " + gpa
                + "\nCredits: " + credits;
    }
}