
import java.util.Scanner;

public class Demowhile {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        double rayon = input.nextDouble();
        do{
            System.out.println("coucou " + Math.PI * rayon * rayon);
            rayon = input.nextDouble();
        } while(rayon>0);
                   System.out.println("abientot");

        }
    }

