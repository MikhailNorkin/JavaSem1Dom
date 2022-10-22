//Реализовать простой калькулятор

import java.util.Scanner;

public class Task3 {

    public static void main(String[] args) {

        System.out.println("Введите через Enter первое число, вырожение и второе число, после чего выйдет итог:"); 

        Scanner Sc = new Scanner(System.in);

        System.out.println("Введите первое число: "); 
        double a = Sc.nextInt();     

        Scanner Sk = new Scanner(System.in);
        System.out.println("Введите выражение: ");        
        String expression = Sk.nextLine();

        System.out.println("Введите второе число: "); 
        double b = Sc.nextInt();

        Sk.close();
        Sc.close();

        double res = 0;
        if (expression.equals(String.valueOf("+"))){
            res = a+b;    
            System.out.printf("Сумма чисел %s и %s равна %s", a, b, res);
        }
        else if (expression.equals(String.valueOf("-"))){
            res = a-b;
            System.out.printf("Разница чисел %s и %s равна %s", a, b, res);
        }
        else if (expression.equals(String.valueOf("*"))){
            res = a*b;    
            System.out.printf("Произведение чисел %s и %s равно %s", a, b, res);
        }
        else if (expression.equals(String.valueOf("/"))){
            res = a/b;    
            System.out.printf("Деление чисел %s и %s равно %s", a, b, res);
        }   
    }
}        

