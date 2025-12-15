//Приведите примеры сужающего преобразования типов.
public class NarrowingExample {
    public static void main(String[] args) {
        int i = 300;
        byte b = (byte) i; // 300 не помещается в byte (-128..127)
        System.out.println("300 как byte: " + b); // Вывод: 44 (300 % 256 = 44, но с учётом знака)

        double d = 123.99;
        int n = (int) d; // Дробная часть отбрасывается
        System.out.println("123.99 как int: " + n); // 123

        long big = 10_000_000_000L;
        int small = (int) big; // Потеря старших битов
        System.out.println("10 млрд как int: " + small); // -727379968 (переполнение)
    }
}

