package org.example.apps.s;
import utils.ArrayUtils;
import java.util.Scanner;
import java.util.Arrays;
public class CA2_StringMethodExercise1_4 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String[] small = new String[2];
        int count = 0;

        while (true) {
            System.out.println("Do you wanna proceed? YES or NO");
            String choice = input.next();
            if (choice.equalsIgnoreCase("No")) {
                break;
            }

            if (choice.equalsIgnoreCase("Yes")) {
                if (count == small.length) {

                    System.out.println("Array has no space: ");
                    small = ArrayUtils.resize(small, small.length + 5);


                    System.out.print("Enter word: ");
                    small[count] = input.nextLine();
                    count++;
                }
            }


            System.out.println("Original array: " + Arrays.toString(small));

            System.out.println("How many words do you want to keep?");
            int keep = input.nextInt();

            String[] choices = utils.ArrayUtils.resize(small, keep);
            System.out.println("New array: " + Arrays.toString(choices));
        }

    }

}