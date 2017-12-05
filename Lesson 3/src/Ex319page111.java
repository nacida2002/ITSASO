
import java.util.Scanner;

public class Ex319page111 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter the 3 sides of a triangle: ");
        double a1 = input.nextDouble();
        double b1 = input.nextDouble();
        double c1 = input.nextDouble();
        if (a1 + b1 > c1 && b1 + c1 > a1 && a1 + c1 > b1) {
            System.out.println("the perimeter is " + (a1 + b1 + c1));
        } else {
            System.out.println("The input is invalid");
        }

    }
}
