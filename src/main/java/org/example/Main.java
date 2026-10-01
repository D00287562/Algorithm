import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Enter first number");
        double num1 = in.nextDouble();
        System.out.println("Enter second number");
        double num2 = in.nextDouble();
        in.nextLine();

        System.out.println("choose the following options");
        System.out.println("Option 1-Addition");
        System.out.println("Option 2-Subtraction");
        System.out.println("Option 3-Divison");
        System.out.println("Option 4-Multiplication");

        String choice = in.nextLine();

        switch (choice) {
            case "1":
                System.out.println(num1 + " + " + num2 + " + " + (num1 + num2));
                break;


            case "2":
                System.out.println(num1 + " - " + num2 + " - " + (num1 - num2));
                break;

            case "3":
                System.out.println(num1 + " % " + num2 + " % " + (num1 % num2));
                break;

            case "4":
                System.out.println(num1 + " * " + num2 + " * " + (num1 * num2));
            default:
                System.out.println("Unable to do");
                break;

        }
    }
}
