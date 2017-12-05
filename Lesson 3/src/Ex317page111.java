
import java.util.Scanner;

public class Ex317page111 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int computer = (int) (Math.random() * 3);

        System.out.print("scissor (0), rock (1), paper (2): ");
        int user = input.nextInt();

        switch (computer) {
            case 0:
                System.out.print("The computer is scissor.");
                break;
            case 1:
                System.out.print("The computer is rock.");
                break;
            case 2:
                System.out.print("The computer is paper.");
        }

        switch (user) {
            case 0:
                System.out.print("I am scissor");
                break;
            case 1:
                System.out.print("I am rock");
                break;
            case 2:
                System.out.print("I am paper ");
        }

        if (computer == user) {
            System.out.println(" It is a draw");
        }else{
        if ((user == 0 && computer == 2) || (user == 1 && computer == 0) || (user == 2 && computer == 1))
                {
            System.out.println(". You won");
        }else {
                System.out.println(". You lose");
            }
    }
}
}
