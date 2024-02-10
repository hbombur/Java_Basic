package ex06;

import java.util.Scanner;
public class Operators {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Выберите категорию: 1 - Масса, 2 - Расстояние");
        int category = scanner.nextInt();
        int type;
        double num;
        switch(category) {
            case 1:
                System.out.println("Выберите единицу измерения: 1 - Грамм, 2 - Килограмм, 3 - Тонна, 4 - Фунт");
                type = scanner.nextInt();
                System.out.println("Введите количество выбранной единицы измерения: ");
                num = scanner.nextInt();
                double g, kg, t, po;
                switch(type) {
                    case 1:
                        g = num;
                        kg = num * 0.001;
                        t = num * 0.000001;
                        po = num * 453.59237;
                        System.out.printf("Результат:\nГраммы: %f\nКилограммы: %f\nТонны: %f\nФунт: %f\nС",
                                    g, kg, t, po);
                        break;
                    case 2:
                        kg = num;
                        g = kg * 1000;
                        t = kg * 0.001;
                        po = num * 453592.37;
                        System.out.printf("Результат:\nКилограммы: %f\nГраммы: %f\nТонны: %f\nФунт: %f\n",
                                    kg, g, t, po);
                        break;
                    case 3:
                        t = num;
                        g = t * 1000000;
                        kg = t * 1000;
                        po = num * 453592370;
                        System.out.printf("Результат:\nТонны: %f\nГраммы: %f\nКилограммы: %f\nФунт: %f\n",
                                    t, g, kg, po);
                        break;
                    case 4:
                        po = num;
                        g = num * 453.59237;
                        kg = num * 0.001 * 453.59237;
                        t = num * 0.000001 * 453.59237;
                        System.out.printf("Результат:\nФунт: %f\nГраммы: %f\nКилограммы: %f\nТонны: %f\n",
                                po, g, kg, t);
                        break;
                }
                break;
            case 2:
                System.out.println("Выберите единицу измерения: 1 - Сантиметр, 2 - Метр, " +
                        "3 - Километр, 4 - Ярд, 5 - Фут");
                type = scanner.nextInt();
                System.out.println("Введите количество выбранной единицы измерения: ");
                num = scanner.nextInt();
                double sm, m, km, yd, ft;
                switch(type) {
                    case 1:
                        sm = num;
                        m = num * 0.01;
                        km = num * 0.00001;
                        yd = num * m * 0.9144;
                        ft = num * m * 0.3048;
                        System.out.printf("Результат:\nСантиметры: %f\nМетры: %f\nКилометры: %f\nЯрды: %f\nФуты: %f\n",
                                sm, m, km, yd, ft);
                        break;
                    case 2:
                        m = num;
                        sm = num * 100;
                        km = num * 0.001;
                        yd = num * 0.9144;
                        ft = num * 0.3048;
                        System.out.printf("Результат:\nМетры: %f\nСантиметры: %f\nКилометры: %f\nЯрды: %f\nФуты: %f\n",
                                    m, sm, km, yd, ft);
                        break;
                    case 3:
                        km = num;
                        sm = num * 100;
                        m = num * 0.001;
                        yd = num * m * 0.9144;
                        ft = num * m * 0.3048;
                        System.out.printf("Результат:\nКилометры: %f\nСантиметры: %f\nМетры: %f\nЯрды: %f\nФуты: %f\n",
                                    km, sm, m, yd, ft);
                        break;
                    case 4:
                        yd = num;
                        sm = num * 0.9144 * 100;
                        m = num * 0.9144;
                        km = num * 0.9144 * 0.001;
                        ft = num * 3;
                        System.out.printf("Результат:\nЯрды: %f\nСантиметры: %f\nМетры: %f\nКилометры: %f\nФуты: %f\n",
                                yd, sm, m, km, ft);
                        break;
                    case 5:
                        ft = num;
                        sm = num * 0.3048 * 100;
                        m = num * 0.3048;
                        km = num * 0.3048 * 0.001;
                        yd = num * 0.3048;
                        System.out.printf("Результат:\nФуты: %f\nСантиметры: %f\nМетры: %f\nКилометры: %f\nЯрды: %f\n",
                                ft, sm, m, km, yd);
                        break;
                }
                break;
        }
    }
}
