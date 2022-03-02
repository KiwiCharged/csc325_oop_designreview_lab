/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.csc325_oop_designreview_lab;

import java.util.Scanner;

/**
 *
 * @author MoaathAlrajab
 */
public class MainClass {
	
    public static void main(String[] args) {
            // ToDo 5: [DONE] Fix the error

            // ToDo 6: [DONE] Fix the constructor of Student class

            // Todo 7: [DONE] Create two classes for Freshman and Senior 

            // ToDo 8: [DONE] The senior class should have a minimum of 85 credits  

            // ToDo 9: [DONE] Add a toString method for Freshman class

            // ToDo 10: [DONE] Add a toString method for Senior class

        Student std1 = new Freshman("James", 20, 12); // name, age, credits

        Student std2 = new Senior("John", 30, 90);

            // ToDo 11: [DONE] Set the gpa of the student using the scanner and user
            // 			input and then print the output.

        Scanner input = new Scanner(System.in);
        
        System.out.println("Please enter a GPA for the Freshman student: ");
        std1.setGpa(Double.parseDouble(input.nextLine()));
        
        System.out.println("Please enter a GPA for the Senior student: ");
        std2.setGpa(Double.parseDouble(input.nextLine()));
        
        System.out.println(std1);

        System.out.println(std2);
        
        System.exit(0);

            // ToDo 12: [DONE] add comments and explain your code

            // ToDo 13: [DONE] submit using a pull request.
    }

}