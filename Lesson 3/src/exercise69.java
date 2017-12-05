import java.util.Scanner;
public class exercise69 {
 public static void main(String[] args) {
        Scanner clavier; // declaration dúne variable "clavier" de type scanner
        clavier = new Scanner(System.in);
        
        
       
        double celsius;
        System.out.println("veuillez introduire Celsius : ");
        celsius= clavier.nextDouble();
        
        double farenheit = celsius * 9 / 5 + 32;
        System.out.println("les degrees Farenheit sont : " + farenheit);
       
            }
    
}
