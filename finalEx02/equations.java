package finalEx02;

import java.util.Scanner;

public class equations {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите уравнение:");
        String equation = scanner.nextLine();
        if (!(equation.contains("x"))) {
            System.out.println("В уравнении нет переменной");
        }
        int indexX = equation.indexOf('x');
        switch (equation.charAt(1)) {
            case '+':
                switch (indexX) {
                    case 0:
                        System.out.println((equation.charAt(4) - 48) - (equation.charAt(2) - 48));
                        break;
                    case 2:
                        System.out.println((equation.charAt(4) - 48) - (equation.charAt(0) - 48));
                        break;
                    case 4:
                        System.out.println((equation.charAt(0) - 48) + (equation.charAt(2) - 48));
                        break;
                }
                break;
            case '-':
                switch (indexX) {
                    case 0:
                        System.out.println((equation.charAt(4) - 48) + (equation.charAt(2) - 48));
                        break;
                    case 2:
                        System.out.println((equation.charAt(0) - 48) - (equation.charAt(4) - 48));
                        break;
                    case 4:
                        System.out.println((equation.charAt(0) - 48) - (equation.charAt(2) - 48));
                        break;
                }
                break;
        }
    }
}
