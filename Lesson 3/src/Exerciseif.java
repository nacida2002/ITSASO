
import java.util.Scanner;

public class Exerciseif {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("write a note: ");
        double note = clavier.nextDouble();
        
        if (note >= 15) {
            System.out.println("b ");
        }
        else {
            if ( note >=10){
                 System.out.println("s ");
        } else {
                 System.out.println("f ");
            }
        
        }
    }
}
