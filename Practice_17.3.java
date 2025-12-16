//Практика #1

public class FormatExample {
    public static void main(String[] args) {
        boolean flag = true;
        char letter = 'A';
        int number = 42;
        double pi = 3.14159;
        String text = "Java";

        System.out.printf("Логическое: %b%n", flag);      // true
        System.out.printf("Символ: %c%n", letter);        // A
        System.out.printf("Целое: %d%n", number);         // 42
        System.out.printf("Число с точкой: %.2f%n", pi);  // 3.14
        System.out.printf("Строка: %s%n", text);          // Java
    }
}

//Практика #2

/*Метод flush() принудительно сбрасывает буфер вывода (например, у Formatter, PrintWriter, OutputStream), 
чтобы все данные немедленно записались в целевой поток (файл, консоль и т.д.).

Без flush() данные могут оставаться в буфере и не отобразиться сразу - особенно если программа завершится аварийно или буфер ещё не заполнен. */

//Практика #3

import java.util.Date;

public class DateTimeFormat {
    public static void main(String[] args) {
        Date now = new Date();

        System.out.printf("Час (24): %tH%n", now);        // например: 14
        System.out.printf("Минуты: %tM%n", now);          // например: 30
        System.out.printf("Год: %tY%n", now);             // например: 2025
        System.out.printf("Месяц: %tm%n", now);           // например: 04
        System.out.printf("День недели: %tA%n", now);     // например: понедельник
    }
}