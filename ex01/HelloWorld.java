package ex01;

public class HelloWorld {
    public static void main(String[] args) {
        /* Так как не указано точно каким образом вывести сообщение в консоль,
        мной использован метод printf(). Так же, если необходимо вывести сообщение с переносом каретки
        в конце строки, можно использовать println(), без переноса каретки - print().
        */
        String message = "Hello World!\n";
        System.out.printf("%s", message);
    }
}
