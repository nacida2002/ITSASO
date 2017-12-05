
import java.util.Scanner;

public class ExamenMenu {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String choix;
        do {
            System.out.println("Tapez 1 pour la section commerciale");
            System.out.println("Tapez 2 pour section comptabilité");
            System.out.println("Tapez Q pour Quitter");
            choix = input.next().toUpperCase(); // indépendant de la case (q => quitter)
            switch (choix) {
                case "1":
                    System.out.println("Section Commerciale");
                    break;
                case "2":
                    System.out.println("Section Comptabilité");
                    break;

                case "Q":
                    System.out.println("Aurevoir");
                    break;  // éviter le default
                default:
                    System.out.println(" ");
            }
        } while (!choix.equals("Q"));
    }
}
