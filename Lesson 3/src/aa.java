	import java.util.Scanner;
public class aa {

		 public static void main(String[] args) {
			  Scanner input = new Scanner(System.in);
			  String choix;
			  int compteur = 1;
			  do {
					System.out.println("Nr d'exécution : " + compteur);
					compteur++;
					System.out.println("Tapez 1 pour continuer");
					System.out.println("Tapez Q pour quitter");
					choix = input.next();
			  } while(! choix.equals("Q"));
			  System.out.println("Goodbye");
		 }
	}