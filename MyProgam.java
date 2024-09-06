// Created by Ronit on Aug 22, 2024
import java.util.Scanner;

public class MyProgam {
    static Scanner scanner = new Scanner(System.in);

    static void challenge1() {
        int days = scanner.nextInt();
        System.out.print(days * 86400);

        
    }


    static void challenge2() {
        int num1 = scanner.nextInt();
        int num2 = scanner.nextInt();
        System.out.print(num1 + num2);

        scanner.close();
    }

    static void challenge3() {
        int num1 = scanner.nextInt();
        Scanner BLAH = new Scanner(System.in);
        int num2 = BLAH.nextInt();
        System.out.println(num1 + num2);
        System.out.println(num1 - num2);
        System.out.println(num1 * num2);
        System.out.println(num1/num2);
    }


    public static void main(String args[]) {
        challenge1();
        challenge2();        
        challenge3();
    }

    
}