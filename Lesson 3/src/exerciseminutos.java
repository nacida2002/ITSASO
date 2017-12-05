import java.util.Scanner;
public class exerciseminutos {
      public static void main(String[] args) {
        Scanner clavier; // declaration dúne variable "clavier" de type scanner
        clavier = new Scanner(System.in);
        int secondes;
        System.out.println("Taper un nombre de secondes :"  );
        secondes= clavier.nextInt();
        int minutes = secondes / 60;		
	int restsecondes = secondes % 60;	
		
       
       System.out.println("Nombre minutes :" + minutes+ "´ Nombre secondes :" + restsecondes+"\"");  
    }
}
