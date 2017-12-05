
import java.util.Scanner;

public class Examplewhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int target = (int) (Math.random() * 10);
        System.out.print(target);
        System.out.print("enter a number from 0 to 10: ");
        int guess = input.nextInt();

        while (target != guess){
        System.out.println("perdu");
        guess = input.nextInt();
    }

    System.out.println ("gagne");
}
    }
