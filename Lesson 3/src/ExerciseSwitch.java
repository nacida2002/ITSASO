
import java.util.Scanner;

public class ExerciseSwitch {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Tapez 1 pour calculer laire: ");
        System.out.println("Tapez 2 pour caculer le perimetre: ");
        System.out.println("Tapez 3 pour quitter: ");
        int choix = input.nextInt();
        switch (choix) {
            case (1):
                System.out.println("on a calculé laire ");
                break;
            case (2):
                System.out.println("on a calculé perimetre: ");
                break;
            case (3):
                System.out.println("on a quitté ");
                break;
                               
        }
    }
}
    
