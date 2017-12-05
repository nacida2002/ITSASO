
import java.util.Scanner;

public class ExamenKelvin {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Entrez un température en degré celsius: ");
        double celsius = input.nextDouble();
        double Kelvin;
        Kelvin = celsius + 273.15;
        System.out.println(celsius + " celsius est " + Kelvin + " Kelvin. ");
    }

}
