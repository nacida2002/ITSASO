import java.util.Scanner;
public class CuadradoConEjesVariante {
    
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("le coté du carré?");
        int cote = input.nextInt();
        System.out.print("position x,y?");
        int posX = input.nextInt();
        int posY = input.nextInt();
        String line = " ";
        //partie horizontale
        //espace
         for (int j = 0; j < posY+cote; j++) {
        for (int i = 0; i < posX+cote; i++) {
            if(i<posX){
            line += " ";
        } else{
            line += "#"; 
            }
            
        for (int j = 0; j < posY+cote; j++) {
            if(i<posY){
            line += " ";
        } else{
            line += "#"; 
            }
       
            System.out.println(line);
        }

    }
}
}

