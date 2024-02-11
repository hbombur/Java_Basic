package ex11;

import java.util.Scanner;

public class WorkWithData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите первое число:");
        String strNum = scanner.nextLine();
        Character charNum = strNum.charAt(0);
        int intNum1 = charNum.charValue() - 48;
        System.out.println("Введите второе число");
        int intNum2 = scanner.nextInt();
        System.out.println(Math.max(intNum1, intNum2));
        System.out.println((double) Math.min(intNum1, intNum2));
    }
}
