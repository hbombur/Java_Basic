package finalEx04;

import java.util.Scanner;

public class Riddle {
    public static void main(String[] args) {
        System.out.println("Отгадай загадку:");
        System.out.println("Сидит дед, во сто шуб одет, кто его раздевает, тот слезы пролевает");
        System.out.println("У тебя есть три попытки");
        System.out.println("Так же у тебя есть подсказка, которую ты можешь использовать только при первой попытке. " +
                "Для этого напиши слово \"Подсказка\"");
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.nextLine();
        boolean flag = false;
        if (answer.compareToIgnoreCase("Подсказка") == 0) {
            System.out.println("Это как то связано с болезнью компьютера!");
            flag = true;
        }
        int countLifeHuck = 0;
        for (int i = 0; i < 2; i++) {
            if (answer.compareToIgnoreCase("Заархивированный вирус") == 0) {
                System.out.println("Правильно!");
                return;
            }
            else if (answer.compareToIgnoreCase("Подсказка") == 0) {
                System.out.println("Подсказка уже не доступна");
                countLifeHuck += 1;
                if (countLifeHuck == 2) {
                    break;
                }
                answer = scanner.nextLine();
            }
            else {
                if (flag)
                    break;
                System.out.println("Подумай еще!");
                answer = scanner.nextLine();
            }
        }
        System.out.println("Обидно, приходи в другой раз");
    }
}
