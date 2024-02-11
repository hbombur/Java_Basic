package finalEx01;

import java.util.Scanner;

public class CurrencyConverter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите курс доллара: ");
        String currencyString = scanner.next();
        float currencyDollar;
        if (currencyString.contains(",")) {
            currencyDollar = Float.parseFloat(currencyString.replace(',', '.'));
        }
        else {
            currencyDollar = Float.parseFloat(currencyString);
        }
        System.out.println("Введите нужную сумму в рублях: ");
        int sumOfRuble = scanner.nextInt();
        Float result = sumOfRuble / currencyDollar;
        System.out.printf("Курс доллара: %.2f\nКоличество рублей: %d\nИтого: %.2f\n", currencyDollar,
                sumOfRuble, result);
    }
}
