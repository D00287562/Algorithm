package apps.Number;
import java.util.Scanner;

import static utils.ArrayUtils.merge;

public class NumberMerging {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] holder1 = new int[5];
        int[] holder2 = new int[5];

        System.out.println("Please enter five numbers for first array");
        for (int i = 0; i < holder1.length; i++) {
            System.out.println("Enter number : " + (i + 1));
            holder1[i] = input.nextInt();
        }


        System.out.println("Please enter five numbers for second array");
        for (int i = 0; i < holder2.length; i++) {
            System.out.println("Enter number : " + (i + 1));
            holder2[i] = input.nextInt();
        }
        int[] finalresult = merge(holder1, holder2);
        for (int i = 0; i < finalresult.length; i++) {

            System.out.println("Position: " + i + " contains numbers: " + finalresult[i]);
        }
    }


}

