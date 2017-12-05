
import java.util.Scanner;

public class Ex418page155 {
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter M/C/I and 1/2/3/4: ");
        String code = input.next();
        
        String code1= "" + code.charAt(0); //Recupere le premier caractere
        String code2= "" + code.charAt(1);
        String message;
        String message2;
                  
            switch(code1)
            {
                case "M":
                    message = "Mathematics";
                    break;
                case "C":
                    message = "Computer Science";
                    break;
                case "I":
                    message = "Information Technology";
                    break;
                default:
                    message = "Invalid input";
                    break;
            }
            switch(code2)
            {
                case "1":
                    message2 = "Freshman";
                    break;
                case "2":
                    message2 = "Sophmore";
                    break;
                case "3":
                    message2 = "Junior";
                    break;
                case "4":
                    message2 = "Senior";
                    break;
                default:
                    message2 = "Invalid input";
                    break;
            }
            System.out.println(message + " "  +  message2);
        }
        
    }

