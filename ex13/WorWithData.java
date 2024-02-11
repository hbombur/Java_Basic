package ex13;

import java.util.Scanner;

public class WorWithData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите слова, разделенные пробелами");
        String[] arrayStr = scanner.nextLine().split(" ");
        char[] arrayChar;
        int counter = 0;
        for (String s : arrayStr) {
            boolean flag = false;
            arrayChar = s.toCharArray();
            for (char c : arrayChar) {
                if (Character.isDigit(c) || Character.UnicodeBlock.of(c).equals(Character.UnicodeBlock.CYRILLIC)) {
                    flag = false;
                    break;
                }
                flag = true;
            }
            if (flag) {
                counter += 1;
                System.out.println(s);
            }
        }
        System.out.println("Количество слов, состоящих только из латиницы:\n" + counter);
    }
}
