package ex08;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        boolean flag = true;
        long num = 0;
        while (flag) {
            System.out.println("Введите любое целое положительное число");
            num = scanner.nextLong();
            if (num <= 0) {
                System.out.println("Необходимо ввести число больше 0");
            }
            else {
                flag = false;
            }
        }
        for (int i = 0; i < num; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println(i);
        }
    }
}
