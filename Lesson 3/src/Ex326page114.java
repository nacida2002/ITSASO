
import java.util.Scanner;

public class Ex326page114 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int x = input.nextInt();
        System.out.print("Is " + x + " divisible by 5 and 6? ");
        if ((x % 5 == 0) && (x % 6 == 0)) {
            System.out.println(" yes");
        } else {
            System.out.println(" no ");
        }

        System.out.print("Is " + x + " divisible by 5 or 6? ");
        if ((x % 5 == 0) || (x % 6 == 0)) {
            System.out.println(" yes");
        } else {
            System.out.println(" no ");
        }

        System.out.print("Is " + x + " divisible by 5 or 6; but not both?? ");

        if ((x % 5 == 0) ^ (x % 6 == 0)) {
            System.out.println(" yes");
        } else {
            System.out.println(" no ");
        }
    }
}
