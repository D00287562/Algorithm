package org.example.apps;

import java.util.Scanner;
import utils.ArrayUtils;

/**
 * Main which collects 10 grades from the user
 * then displays the average of them
 */
public class ArrayManipulation {
    public static void main(String [] args) {
        int[] grades = new int[10];
        for (int i = 0; i < grades.length; i++) {
            grades[i] = getValidInteger("Enter your grade");
        }
        int results = ArrayUtils.calcAverage(grades);
        System.out.println("you gpa: " + results);
    }




public static int getValidInteger(String prompt) {
    Scanner input = new Scanner(System.in);
    System.out.println(prompt);


    while (!input.hasNextInt()) {
        System.out.println("Not allowed, please try again");

        input.next();
        System.out.println(prompt);
    }
    return input.nextInt();

}



    }





