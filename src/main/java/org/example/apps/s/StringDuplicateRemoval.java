package org.example.apps.s;

import java.util.Scanner;
import java.util.Arrays;
import org.example.utils.NumberUtilities;

public class StringDuplicateRemoval {
    public static void main(String [] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your words");
        String text = input.nextLine();
        String[] words = text.split("");
        String[] filt = new String[0];
        for (int i = 0; i < words.length; i++ ) {
            String current = words[i];
            boolean false3 = false;

            for (int j = 0; j < filt.length; j++) {
                if (current.equals(filt[j])) ;
                false3 = true;

                if (false3 == false) {
                    String[] newwords = new String[filt.length + 1];

                    for (int k = 0; k < filt.length; k++) {
                        newwords[k] = filt[k];

                        newwords[newwords.length - 1] = current;
                        filt = newwords;
                    }
                }
            }
        }
        System.out.println("Duplicate " + Arrays.toString(filt));
    }

}
