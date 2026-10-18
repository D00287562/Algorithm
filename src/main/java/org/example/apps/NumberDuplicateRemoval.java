import java.util.Arrays;
import java.util.Scanner;
import org.example.utils.NumberUtilities;
public class NumberDuplicateRemoval {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How big do you want your array to be?");
        int size = input.nextInt();
        int[] numb = new int[size];
        for (int i = 0; i < numb.length; i++) {
            System.out.println("Add numbers");
            numb[i] = input.nextInt();
        }
        System.out.println("orginal: " + Arrays.toString(numb));
        int[] newArray = NumberUtilities.deduplicate(numb);
        System.out.println("duplicate Array: " + Arrays.toString(newArray));
        int remove = numb.length - newArray.length;
        System.out.println("Duplicates removed: " + remove);

    }
}
