
public class ArrayUtils {


public static void main(String[] args) {
    int[] numbers = {10, 32, 15, 27};
    displayArray(numbers);

    displayArray("Hi");
    displayArray("yes");
    displayArray("cake");
    displayArray("triple");

    int[] num = {32, 45, 64, 13};
            int result = calcAverage(num);
            System.out.println("The average is: " + result);


}

public static void displayArray(int[] numbers) {
    int count = 0;
    for (int i = 0; i < numbers.length; i++) {
        System.out.println("position " + i + "holds " + numbers[i]);
    }
}


public static void displayArray(String character) {
    for (int i = 0; i < character.length(); i++) {
        System.out.println("position " + i + "holds " + character.charAt(i));
    }
}

    /**
     * the method returns to you the average of the numbers in the array
     * @param num the array of integers to be calculated
     * @return the calculated integer of the entire array
     */

public static int calcAverage (int[] num) {
    int sum = 0;
    for(int i = 0; i < num.length; i++) {
       sum =  sum + num[i];
    }
    int avg = sum / num.length;
    return avg;
}



}



