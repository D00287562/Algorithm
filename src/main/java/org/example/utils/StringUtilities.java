package org.example.utils;
import java.util.Scanner;

public class StringUtilities {

    public static void main(String [] args) {
        System.out.println("Enter a word");
        Scanner keyboard = new Scanner(System.in);
        String sentence = keyboard.nextLine();
        String[] newwords = sentence.split(" ");
        String[] finalwords = StringUtilities.deduplicate(newwords);
        System.out.println("Deduplicated strings:" + java.util.Arrays.toString(finalwords));
    }

    public static String[] deduplicate (String[] split) {
        String[] empty = new String [0];
        for (int i = 0; i < split.length; i++) {
            String currentString = split[i];
        boolean false2 = false;
        for (int j = 0; j < empty.length; j++) {
         if (currentString.equals(empty[j])){
                false2 = true;
            }
            }
        if (false2 == false) {
            String[] newString = new String [empty.length + 1];
            for (int k = 0; k < empty.length; k++) {
                newString[k] = empty[k];
            }
            newString[newString.length -1] = currentString;
            empty = newString;
        }

        }
        return empty;
    }

}
