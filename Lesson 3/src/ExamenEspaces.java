
import java.util.Scanner;

public class ExamenEspaces {

    public static void main(String[] args) {
        String phrase;
        int countBlank;
        int length;
        char ch;

        Scanner scan = new Scanner(System.in);
        System.out.print("Ecrivez une phrase: ");
        phrase = scan.nextLine();
        length = phrase.length();

        countBlank = 0;
        for (int i = 0; i < phrase.length(); i++) {
            if (Character.isWhitespace(phrase.charAt(i))) {
                countBlank++;
            }
        }
        int letters = phrase.length() - countBlank;

        System.out.println("Le texte contient\n"
                + "	.) " + countBlank + " espaces\n"
                + "	.) " + letters + " lettres ");
    }
}
