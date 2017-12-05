
import java.util.Scanner;
public class CuadradoBoocleImbricke {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("le coté du carré?");
        int cote = input.nextInt();
       
        for (int i = 0; i < cote; i++) {
             for (int j = 0; j < cote; j++) {
            System.out.print("#");
        }
            System.out.println("");
    }
}

    }

