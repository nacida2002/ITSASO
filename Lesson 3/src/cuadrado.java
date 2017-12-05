
import java.util.Scanner;

public class cuadrado {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("le coté du carré?");
        int cote = input.nextInt();
        String line = "";
        for (int i = 0; i < cote; i++) {
            line += "#";
        }
        //ecrire "line" autant de fois que la longueur de son cote
        for (int j = 0; j < cote; j++) {
            System.out.println(line);

        }

    }
}
