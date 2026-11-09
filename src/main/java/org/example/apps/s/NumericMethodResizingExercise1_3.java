package org.example.apps.s;

import static utils.ArrayUtils.grows;


public class NumericMethodResizingExercise1_3 {

    public static void main(String[] args) {

        java.util.Scanner input = new java.util.Scanner(System.in);
        System.out.println("How big do you want your array to be?");
        int size = input.nextInt();
        int[] num = new int[size];
        for (int i = 0; i < num.length; i++) {
            System.out.println("Add numbers");
            num[i] = input.nextInt();
        }
        System.out.println("Do you wanna continue? yes/no");
        String choice = input.next();
        if (choice.equalsIgnoreCase("yes")) {
            int oldlength = num.length;
            num = grows(num);
            System.out.println("Array is bigger by 10 slots");

            for (int i = oldlength; i < num.length; i++) {
                System.out.println("Add numbers ");
                num[i] = input.nextInt();
            }
        }

        System.out.println("Array " + java.util.Arrays.toString(num));
    }
}
