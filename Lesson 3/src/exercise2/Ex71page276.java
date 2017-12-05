package exercise2;

import java.util.Scanner;

public class Ex71page276 {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number os students ");
        int students = input.nextInt();
        System.out.print("Enter 4 scores: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();
        int d = input.nextInt();
        int best = Math.max(Math.max(Math.max(a, b), c), d);
       
        if (best - a <= 10) {
           System.out.println("Student 0 score is " + a + " and grade is A");
        } else if (best - a > 10 && best - a <= 20) {
           System.out.println("Student 0 score is " + a + " and grade is B");
        } else if (best - a > 20 && best - a <= 30) {
           System.out.println("Student 0 score is " + a + " and grade is C");
        } else if (best - a > 30 && best - a <= 20) {
           System.out.println("Student 0 score is " + a + " and grade is D");
        } else {
            System.out.println("Student 0 score is " + a + " and grade is E");
        }
        if (best - b <= 10) {
           System.out.println("Student 1 score is " + b+ " and grade is A");
        } else if (best - b > 10 && best - b <= 20) {
           System.out.println("Student 1 score is " + b + " and grade is B");
        } else if (best - b > 20 && best - b <= 30) {
           System.out.println("Student 1 score is " + b + "  and grade is C");
        } else if (best - b > 30 && best - b <= 20) {
           System.out.println("Student 1 score is " + b + " and grade is D");
        } else {
            System.out.println("Student 1 score is " + b + " and grade is E");
        }
        if (best - c <= 10) {
           System.out.println("Student 2 score is " + c + " and grade is A");
        } else if (best - c > 10 && best - c <= 20) {
           System.out.println("Student 2 score is " + c + " and grade is B");
        } else if (best - c > 20 && best - c <= 30) {
           System.out.println("Student 2 score is " + c + " and grade is C");
        } else if (best - c > 30 && best - c <= 20) {
           System.out.println("Student 2 score is " + c + " and grade is D");
        } else {
            System.out.println("Student 2 score is " + c + " and grade is E");
        }
        if (best - d <= 10) {
           System.out.println("Student 3 score is " + d + " and grade is A");
        } else if (best - d > 10 && best - d <= 20) {
           System.out.println("Student 3 score is " + d + " and grade is B");
        } else if (best - d > 20 && best - d <= 30) {
           System.out.println("Student 3 score is " + d + " and grade is C");
        } else if (best - d > 30 && best - d <= 20) {
           System.out.println("Student 3 score is " + d + " and grade is D");
        } else {
            System.out.println("Student 3 score is " + d + " and grade is E");
        }

    }

}
