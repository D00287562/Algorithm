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
        int Max = 0;
        for (int i = 0; i < grades.length; i++) {
            grades[i] = getValidInteger("Enter your grade");
            if (grades[i] > Max) {
                Max = grades[i];
            }
        }
        int results = ArrayUtils.calcAverage(grades);
        System.out.println("you gpa " + results + " and highest grade: " + Max);


        String words[] = new String[10];
        Scanner keyboard = new Scanner(System.in);

        for (int i = 0; i < words.length; i++) {
            System.out.println("Enter word" + (i + 1) + ": ");
            words[i] = keyboard.nextLine();
        }

        String Maxwords = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].compareTo(Maxwords) > 0) {
                Maxwords = words[i];
            }
            System.out.println("The last text that appears in the dictionary is" + Maxwords);
        }
        int[] lowestgrade = new int[10];
        int Min =  12;
        for (int i = 0; i < lowestgrade.length; i++) {
            lowestgrade[i] = getValidInteger("Enter your grade");
            if (lowestgrade[i] < Min) {
                Min = lowestgrade[i];
            }
        }
        System.out.println("Your lowest grade: " + Min);



        String firstwords[] = new String[10];

        for (int i = 0; i < firstwords.length; i++) {
            System.out.println("Enter word" + (i + 1) + ": ");
            firstwords[i] = keyboard.nextLine();
        }

        String Minwords = firstwords[0];
        for (int i = 0; i < firstwords.length; i++) {
            if (firstwords[i].compareTo(Minwords) < 0) {
                Minwords = firstwords[i];
            }
            System.out.println("The first text that appears in the dictionary is " + Minwords);
        }
       int[] seventy = {34, 70, 81, 33, 21, 19};
       int resultseventy = seventygrade(seventy);
       System.out.println("the number 70 appeared: " + resultseventy);
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

public static int seventygrade (int[] seventy) {
    int value = 70;
    int count = 0;
    for (int i = 0; i < seventy.length; i++) {
        if (seventy[i] == value) {
            count++;
        }
    }
    return count;
}}





