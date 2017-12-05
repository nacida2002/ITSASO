
import java.util.Scanner;

public class exe26page69 {

    public static void main(String[] args) {
        Scanner clavier; // declaration dúne variable "clavier" de type scanner
        clavier = new Scanner(System.in);
        int number;
        
        System.out.println("Enter a number between 0 and 1000 :");
        number = clavier.nextInt();
        
        if(0<= number && number<1000){
            int ultima = number % 10;
            number /= 10;
            int decena = number % 10;
            number /= 10;
            int centena = number % 10;
            number /= 10;
            int totalsum = centena + decena + ultima;
            System.out.println("The of the digits is :" + totalsum);
    }  else{ 
            if (number<0) {
                         System.out.println("The number is small :" + number);}
            
            else {
                    
               System.out.println("The number is too big :" + number);}      
            }}
}


