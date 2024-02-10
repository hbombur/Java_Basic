package ex10;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        System.out.println("Укажите размер матрицы. Длина:");
        Scanner scanner = new Scanner(System.in);
        int a;
        int b;
        a = scanner.nextInt();
        System.out.println("Укажите размер матрицы. Высота:");
        b = scanner.nextInt();
        System.out.println("Наполните матрицу положительными целыми числами по одному значению:");
        int [][] arrayInt = new int[b][a];
        for (int i = 0; i < b; i++) {
            for (int j = 0; j < a; j++) {
                arrayInt[i][j] = scanner.nextInt();
            }
        }
        for (int k = 0; k < a; k++) {
            System.out.println(arrayInt[0][k] * 3);
        }
    }
}
