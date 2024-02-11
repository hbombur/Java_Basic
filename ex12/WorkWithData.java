package ex12;

import java.util.Scanner;

public class WorkWithData {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите в консоль следующую строку: \"I like Java!!!\"");
        String str = scanner.nextLine();
        boolean strContains = str.contains("Java");
        boolean strStartWith = str.startsWith("I like");
        boolean strEndsWiths = str.endsWith("!!!");
        if (strContains & strStartWith & strEndsWiths) {
            System.out.println(str.toUpperCase());
        }
        System.out.println(str.replace("a", "o")
                .substring(str.indexOf("J"), str.indexOf("J") + 4));
    }
}
