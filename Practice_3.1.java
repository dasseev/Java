//Изучите утилиту javadoc и научитесь ее пользоваться.
/**
 * Программа для ввода имени и вывода приветствия.
 * Демонстрирует использование Javadoc-комментариев.
 *
 * @author Дарья
 * @version 1.0
 * @since 2025-04-05
 */
import java.util.Scanner;

public class Practice_Javadoc {

    /**
     * Основной метод программы.
     * Запрашивает у пользователя имя и выводит приветствие.
     *
     * @param args аргументы командной строки (не используются)
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите имя: ");
        String name = scanner.nextLine();
        String greeting = createGreeting(name);
        System.out.println(greeting);
        scanner.close();
    }

    /**
     * Создаёт строку приветствия для указанного имени.
     *
     * @param name имя пользователя; не должно быть null или пустым
     * @return строка вида "Привет, {name}!"
     * @throws IllegalArgumentException если имя null или пустое
     */
    public static String createGreeting(String name) {
        if (name == null || name.trim().isEmpty()) {
            throw new IllegalArgumentException("Имя не может быть пустым");
        }
        return "Привет, " + name.trim() + "!";
    }
}