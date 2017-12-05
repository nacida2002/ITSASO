
import java.util.Scanner;

public class ex318page111 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Weigh?: ");
        double poids = input.nextDouble();
        if (0 < poids && poids <= 1) {
            System.out.println("Cout du transport €3.50");
        } else if (1 < poids && poids <= 3) {
            System.out.println("Cout du transport €5.50");
        } else if (3 < poids && poids <= 10) {
            System.out.println("Cout du transport €8.50");
        } else if (10 < poids && poids <= 20) {
            System.out.println("Cout du transport €10.50");
        } else if (50 < poids) {
            System.out.println("the package cannot be shipped");
        }

    }
}
