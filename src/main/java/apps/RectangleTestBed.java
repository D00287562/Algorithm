package apps;
import org.example.entetis.Rectangle;
import java.util.Scanner;
import java.util.ArrayList;

public class RectangleTestBed {
    public static void main(String [] args) {
         ArrayList<Rectangle> rectanglebox = new ArrayList<Rectangle>();
         Scanner input = new Scanner(System.in);
         for(int i = 0; i < 5; i++) {
             Rectangle rect = new Rectangle();

             System.out.println("Please enter the Rectangle length");
             rect.length = input.nextDouble();

             System.out.println("Please enter the Rectangle width ");
             rect.width = input.nextDouble();

             System.out.println("Please enter the Rectangle color");
             rect.color = input.next();

             rectanglebox.add(rect);
         }
    }
}
