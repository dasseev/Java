//Практика #1

public class StringMethods {
    public static void main(String[] args) {
        String s = "  Hello World!  ";

        // 1. length() — длина строки
        System.out.println("Длина: " + s.length());

        // 2. trim() — удаляет пробелы по краям
        String t = s.trim();
        System.out.println("После trim: '" + t + "'");

        // 3. toLowerCase() — в нижний регистр
        System.out.println("В нижнем регистре: " + t.toLowerCase());

        // 4. toUpperCase() — в верхний регистр
        System.out.println("В верхнем регистре: " + t.toUpperCase());

        // 5. substring(int beginIndex, int endIndex) — вырезает часть строки
        System.out.println("Подстрока: " + t.substring(6, 11)); // "World"

        // 6. replace(char old, char new) — заменяет символы
        System.out.println("Замена: " + t.replace('o', '0')); // "Hell0 W0rld!"

        // 7. equals(Object) — сравнивает содержимое (регистрозависимо)
        System.out.println("Равно 'hello world!'? " + t.equals("hello world!")); // false

        // 8. equalsIgnoreCase — сравнивает без учёта регистра
        System.out.println("Равно без регистра? " + t.equalsIgnoreCase("HELLO WORLD!")); // true

        // 9. startsWith(String) — проверяет начало строки
        System.out.println("Начинается с 'Hello'? " + t.startsWith("Hello")); // true

        // 10. indexOf(String) — ищет позицию подстроки
        System.out.println("Индекс 'World': " + t.indexOf("World")); // 6
    }
}

//Практика #2

import java.util.StringJoiner;

public class StringJoinerExample {
    public static void main(String[] args) {
        // Простой пример: соединение через запятую
        StringJoiner sj = new StringJoiner(", ");
        sj.add("яблоки").add("бананы").add("апельсины");
        System.out.println(sj); // яблоки, бананы, апельсины

        // С префиксом и суффиксом (например, для списка в скобках)
        StringJoiner list = new StringJoiner(", ", "[", "]");
        list.add("1").add("2").add("3");
        System.out.println(list); // [1, 2, 3]
    }
}

//Практика #3

/*В Java три двойные кавычки ("""...""") — это text blocks (текстовые блоки), введённые в Java 15.

Они нужны, чтобы:

писать многострочные строки без \n;
избегать экранирования кавычек внутри строки;
сохранять форматирование (отступы, переносы). */