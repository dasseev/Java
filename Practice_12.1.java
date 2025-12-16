//Приведите примеры класса, в котором перегружен метод с переменным числом параметров.

public class Printer {
    public static void print(int... numbers) {
        System.out.print("int: ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

    public static void print(String... texts) {
        System.out.print("String: ");
        for (String s : texts) {
            System.out.print(s + " ");
        }
        System.out.println();
    }

    public static void print(String prefix, int... numbers) {
        System.out.print(prefix + ": ");
        for (int n : numbers) {
            System.out.print(n + " ");
        }
        System.out.println();
    }
}