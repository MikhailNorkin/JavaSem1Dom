//  Вычислить n-ое треугольного число(сумма чисел от 1 до n), n! (произведение чисел от 1 до n)

import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        java.util.Scanner iScanner = new Scanner (System.in);
        System.out.print("Введите число: ");
        int n = iScanner.nextInt();
        iScanner.close();
        int fac = 1;
        int triangle = 0;
        for (int i = 1; i <=n ; i++) {
            triangle = triangle + i;
            fac = fac * i;
        }
        System.out.printf("Треугольное число %s равено: %s\n", n, triangle);
        System.out.printf("Факториал числа %s равен: %s", n, fac);
    }
}