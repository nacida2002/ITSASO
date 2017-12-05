package exercise2;

public class Tableau {

    public static void main(String[] args) {
        int taille = 10;
        int[] tableau = new int[taille];
        afficheTableau(tableau);
        for (int i = 0; i < tableau.length; i++) {
        tableau[i] = 100 + i

    private static void afficheTableau(int[] tableau) {
        for (int i = 0; i < tableau.length; i++) {
            System.out.print(tableau[i] + " ");
        }
        System.out.println(" ");
    }
}
