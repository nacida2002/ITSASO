import java.util.Scanner;
public class ex22page69 {
 public static void main(String[] args) {
        Scanner clavier; // declaration dúne variable "clavier" de type scanner
        clavier = new Scanner(System.in);
        final double PI= 3.1415927; 
        double radius;
        double length;
        System.out.println("Enter the radius and" + "the length of a cylinder : "  );
        radius= clavier.nextDouble();
        length= clavier.nextDouble();
        double area = radius * radius  * PI;
        System.out.println("The area is: " + area);
        double volume = area * length;
        System.out.println("The volume is :" + volume);
        
    }
    
}
