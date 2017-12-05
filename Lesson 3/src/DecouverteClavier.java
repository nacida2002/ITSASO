


import java.util.Scanner;

public class DecouverteClavier {
    public static void main(String[] args) {
        Scanner clavier; // declaration dúne variable "clavier" de type scanner
        clavier = new Scanner(System.in);
        final double PI= 3.1415927; 
        double rayon;
        System.out.println("veuillez introduire rayon : ");
        rayon= clavier.nextDouble();
        System.out.println("vous avez demandé l´aire d´un cercle de rayon" + rayon);
        double perimetre = 2 * PI * rayon;
        System.out.println("le  perimetre est : " + perimetre);
        double aire = PI * rayon * rayon;
        System.out.println("láire est :" + aire);
        
    }
    
}
