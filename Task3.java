// Реализовать простой калькулятор

import java.util.Scanner;

public class Task3 {

    public static int metod_input() {
        java.util.Scanner iScanner = new Scanner (System.in);
        System.out.print("Введите число: ");
        int n = iScanner.nextInt();
        iScanner.close();
        return n;
    }

    public static String metod_expression() {
        java.util.Scanner iScanner = new Scanner (System.in);
        System.out.print("Введите выражение: ");
        String n = iScanner.nextLine();
        iScanner.close();
        return n;
    }
    public void metod_close() {
        java.util.Scanner iScanner = new Scanner (System.in);
        iScanner.close();
    }

    public static void main(String[] args) {
        int a = metod_input();
        String v = metod_expression();
        int b = metod_input();
        Task3 test = new Task3 ();
        test.metod_close();
        System.out.println(v);
        if (v.equals(String.valueOf("+"))) {
            System.out.printf("Сумма а и b равна %s\n", a+b);
        }    
    }
}