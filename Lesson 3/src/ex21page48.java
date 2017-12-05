
public class ex21page48 {

    public static void main(String[] args) {
        int a = 56 % 6;
        int b = 78 % -4;
        int c = -34 % 5;
        int d = -34 % -5;
        System.out.println(" a " + a + " b " + b + " c " + c + " d " + d);
        int e = 100 % 7;
        int day = 2 + e;
        if (day == 7) {
            System.out.println("SUnd");
        }
        if (day == 6) {
            System.out.println("Satur");
        }
        if (day == 5) {
            System.out.println("Fidday");
        }
        if (day == 4) {
            System.out.println("Thursday");
        }
        if (day == 3) {
            System.out.println("WWday");
        }
        if (day == 2) {
            System.out.println("Tuesday");
        }
        if (day == 1) {
            System.out.println("Monday");
        }

    }

}
