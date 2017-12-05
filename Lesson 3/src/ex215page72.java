
import java.util.Scanner;

public class ex215page72 {

    public static void main(String[] args) {
        Scanner clavier = new Scanner(System.in);
        System.out.println("Enter x1 and y1: ");
        double x1 = clavier.nextDouble();
        double y1 = clavier.nextDouble();
        System.out.println("Enter x2 and y2: ");
        double x2 = clavier.nextDouble();
        double y2 = clavier.nextDouble();

        double dentroraiz = Math.pow(x2 - x1, 2) + Math.pow(y2 - y1, 2);
        double raiz = Math.pow(dentroraiz, 0.5);

        System.out.printf("The distance between two points is " + raiz);

    }
}
