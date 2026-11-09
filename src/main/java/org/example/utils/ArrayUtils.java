package utils;

public class ArrayUtils {



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
     *
     * @param num the array of integers to be calculated
     * @return the calculated integer of the entire array
     */

    public static int calcAverage(int[] num) {
        int sum = 0;
        for (int i = 0; i < num.length; i++) {
            sum = sum + num[i];
        }
        int avg = sum / num.length;
        return avg;
    }


    /**
     * finds the highest integer in the array
     *
     * @param highest is the array in which it finds the biggest integer
     * @return the biggest integer
     */
    public static int findMax(int[] highest) {
        int Max = highest[0];
        for (int i = 0; i < highest.length; i++) {
            if (Max < highest[i]) {
                Max = highest[i];
            }

        }
        return Max;
    }


    /**
     * finds Alphabetically the last string in the array
     *
     * @param words the array of the strings
     * @return the string that is the last
     */
    public static String findMax(String[] words) {
        String Max = words[0];
        for (int i = 0; i < words.length; i++) {
            if (words[i].compareTo(Max) > 0) {
                Max = words[i];
            }
        }
        return Max;
    }

    /**
     * finds the lowest integer in the array
     * @param lowest is the array in which it finds the lowest number
     * @return the lowest integer
     */
    public static int findMin(int[] lowest) {
        int Min = lowest[0];
        for (int i = 0; i < lowest.length; i++) {
            if (lowest[i] < Min) {
                Min = lowest[i];
            }
        }
        return Min;
    }

    /**
     * finds the first element that would appear in an array of text alphabetically
     * @param first is the array in which it finds the first element
     * @return the first element in the array
     */
    public static String findMin(String[] first) {
        String Max = first[0];
        for (int i = 0; i < first.length; i++) {
            if (first[i].compareTo(Max) < 0) {
                Max = first[i];
            }
        }
        return Max;
    }
public static int count (int[] nums, int value) {
    int counts = 0;
    for (int i = 0; i < nums.length; i++) {
        if (nums[i] == value) {
            counts++;
        }

    }
    return counts;

}

public static int[] grow (int[] num) {
        int orginal = num.length;
        int[] Large = new int [orginal + 10];
        for(int i = 0; i < num.length; i++){
            Large[i] = num[i];
        }
        return Large;
}

public static int[] grows (int[] nums) {
        int[] bigger = new int [nums.length + 10];
        for (int i = 0; i < nums.length; i++) {
            bigger[i] = nums[i];
        }
        return bigger;
}

    public static String[] resize (String[] text, int newsize) {
        int textorginal = text.length;
        String[] Large = new String [newsize];
        int limit = Math.min(text.length, newsize);
        for(int i = 0; i < limit; i++){
            Large[i] = text[i];
        }
        return Large;
    }

    public static int[] merge(int[] num1, int[] num2) {
        int[] merged = new int[num1.length + num2.length];
        int count = 0;
        for (int i = 0; i < num1.length; i++) {
            merged[count] = num1[i];
            count++;
        }
        for (int i = 0; i < num2.length; i++) {
            merged[count] = num2[i];
            count++;
        }
        return merged;
    }




    }







