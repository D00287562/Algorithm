
public class ArrayUtils {


public static void main(String[] args) {
    int[] numbers = {10, 32, 15, 27};
    displayArray(numbers);

    displayArray("Hi");
    displayArray("yes");
    displayArray("cake");
    displayArray("triple");
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


public static int calcAvarage (int )



}



