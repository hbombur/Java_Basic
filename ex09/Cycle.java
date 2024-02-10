package ex09;

import java.util.Scanner;

public class Cycle {
    public static void main(String[] args) {
        int arraySize;
        System.out.println("Укажите размер массива");
        Scanner scanner = new Scanner(System.in);
        arraySize = scanner.nextInt();
        System.out.println("Заполните массив числами по одному за итерацию");
        double[] nums = new double[arraySize];
        for (int i = 0; i < arraySize; i++) {
            nums[i] = scanner.nextDouble();
        }
        double sum = 0;
        for (double num : nums) {
            sum += num;
        }
        sum = sum / arraySize;
        for (double num : nums) {
            System.out.println(num * sum);
        }
    }
}
