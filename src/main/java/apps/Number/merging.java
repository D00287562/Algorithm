package apps.Number;
import java.util.Scanner;

public class merging {
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
            int[] finalresult = merged(holder1, holder2);
            for (int i = 0; i < finalresult.length; i++) {

                System.out.println("Position " + i + " contains numbers" + finalresult[i]);
            }
        }


    }

    public static int[] merged(int[] holder1, int[] holder2) {
        int[] merged = new int[holder1.length + holder2.length];
        for (int i = 0; i < holder1.length; i++) {
            merged[i] = holder1[i];
        }
        for (int i = 0; i < holder1.length; i++) {
            merged[holder1.length + i] = holder2[i];
        }
        return merged;

    }

