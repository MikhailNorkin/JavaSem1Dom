//  Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        java.util.Scanner iScanner = new Scanner (System.in);
        System.out.print("Введите фактариал: ");
        int n = iScanner.nextInt();
        iScanner.close();
        int fac = 1;
        for (int i = 1; i <=n ; i++) {
            fac = fac * i;
        }
        System.out.printf("Факториал %s равен: %s", n, fac);
    }
}