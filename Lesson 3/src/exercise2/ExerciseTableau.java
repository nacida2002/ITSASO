
package exercise2;
import java.util.Scanner;
public class ExerciseTableau {
   
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("que multiplicador aplicar a la serie: ");
        int multiplicador = input.nextInt();
        System.err.print("el numero de caracteres en la tabla: ");
        int numero = input.nextInt();
        int[] table = new int[numero+1];
        for(int i=0; i<=numero; i++) {
            table[i] = i * multiplicador;
        }
        for (int i : table) {
            System.out.print(i + " - ");
        }
    }
}

    

