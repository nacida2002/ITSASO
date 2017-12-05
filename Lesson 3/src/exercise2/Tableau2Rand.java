
package exercise2;
import java.util.Scanner;

public class Tableau2Rand {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("meter numero minimo y maximo para la serie ");
        int minimo = input.nextInt();
        int maximo = input.nextInt();
        System.err.print("el numero de caracteres en la tabla: ");
        int numero = input.nextInt();
        int[] table = new int[numero+1];
        for(int i=0; i<=numero; i++) {
            table[i] =  (int)(Math.random() * (maximo-minimo)) + minimo;
        }
        for (int element : table) {
            System.out.print(element + " - ");
        }
    }
}

    

