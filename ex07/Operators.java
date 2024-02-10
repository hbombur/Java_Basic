package ex07;

import java.util.Scanner;

public class Operators {
    public static void main(String[] args) {
        int x = 6;
        int y = 3;
        int z = 8;
        boolean boolX = false;
        boolean boolY = false;
        boolean boolZ = false;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите размер массива: ");
        int a = scanner.nextInt();
        int[] arrayInt = new int[a];
        Scanner scanner1 = new Scanner(System.in);
        System.out.println("Теперь введите значения для этого массива в одну строку через пробел. " +
                "Символов должно быть соответственно указанному размеру массива");
        String str = scanner1.nextLine();
        char[] arrayChar = str.toCharArray();
        for (int i = 0; i < arrayChar.length; i++) {
            arrayInt[i] = arrayChar[i] - 48;
            System.out.println("array = " + arrayInt[i]);
            System.out.println("str = " + str);
        }
        for (int j : arrayInt) {
            if (x == j) {
                boolX = true;
            } else if (y == j) {
                boolY = true;
            } else if (z == j) {
                boolZ = true;
            }
        }
        if (boolX || boolY || boolZ) {
            System.out.println("Данное значение имеется в константах");
        }
        scanner.close();
        scanner1.close();
    }
}
