package ex04;

import java.util.Scanner;

public class Opertors {
    public static void main(String[] args) {
        /*
        В задании не указана необходимость обработки исключений, поэтому не включил их в программу
         */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число: ");
        int a = scanner.nextInt();
        System.out.println("Введите второе число: ");
        int b = scanner.nextInt();
        System.out.println("Введите третье число: ");
        int c = scanner.nextInt();
        scanner.close();
        float midDiv = (float) (a + b + c) / 3;
        System.out.println(midDiv);
        int divisiMidDiv = (int) midDiv / 2;
        System.out.println("divisiMidDiv = " + divisiMidDiv);
        if (divisiMidDiv > 3) {
            System.out.println("Программа выполнена корректно");
        }
    }
}
