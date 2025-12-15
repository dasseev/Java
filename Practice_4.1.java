//Приведите примеры использования всех определенных выше операторов с операндами базовых типов, а также с операндами типа String. 
//Для операторов ++ и -- продемонстрируйте префиксную и постфиксную форму записи.
public class OperatorsExample {
    public static void main(String[] args) {
        // --------- Базовые типы (int, boolean и др.) ---------
        int a = 10, b = 3;
        boolean x = true, y = false;

        // Присваивание и составные операторы
        int result = a;             // =
        result += b;                // +=
        result -= 2;                // -=
        result *= 2;                // *=
        result /= 3;                // /=
        result %= 4;                // %=

        // Тернарный оператор
        int max = (a > b) ? a : b;  // ?:

        // Логические операторы короткого замыкания
        boolean or = x || y;        // ||
        boolean and = x && y;       // &&

        // Побитовые операторы
        int bitwiseOr = a | b;      // |
        int bitwiseXor = a ^ b;     // ^
        int bitwiseAnd = a & b;     // &

        // Операторы сравнения
        boolean eq = (a == b);      // ==
        boolean neq = (a != b);     // !=
        boolean gt = a > b;         // >
        boolean gte = a >= b;       // >=
        boolean lt = a < b;         // <
        boolean lte = a <= b;       // <=

        // Побитовые сдвиги
        int rightShift = a >> 1;    // >>   (10 → 5)
        int unsignedRight = a >>> 1;// >>>  (беззнаковый)
        int leftShift = a << 1;     // <<   (10 → 20)

        // Арифметические операторы
        int sum = a + b;            // +
        int diff = a - b;           // -
        int prod = a * b;           // *
        int div = a / b;            // /
        int mod = a % b;            // %

        // Инкремент/декремент (префиксная и постфиксная формы)
        int c = 5;
        int postfix = c++;  // postfix = 5, c = 6
        int prefix = ++c;   // c = 7, prefix = 7
        int d = 5;
        int postDec = d--;  // postDec = 5, d = 4
        int preDec = --d;   // d = 3, preDec = 3

        // Унарные операторы
        int bitwiseNot = ~a;        // ~ (инверсия битов)
        boolean not = !x;           // ! (логическое НЕ)

        // Операторы доступа
        int[] arr = {1, 2, 3};
        int first = arr[0];         // []
        int value = (a + b) * 2;    // () — группировка

        // --------- Операторы со String ---------
        String s1 = "Привет";
        String s2 = "Мир";

        // Конкатенация
        String concat1 = s1 + " " + s2;         // +
        String concat2 = s1;
        concat2 += "!";                         // +=

        // Операторы сравнения (для объектов — сравнение ссылок!)
        boolean strEq = (s1 == s2);             // == — сравнивает ссылки
        boolean strNeq = (s1 != s2);            // !=

        // Присваивание
        String s3 = s1;                         // =

        // Вывод для проверки
        System.out.println("Результаты:");
        System.out.println("max = " + max);
        System.out.println("postfix = " + postfix + ", c after = " + c);
        System.out.println("prefix = " + prefix);
        System.out.println("Конкатенация: " + concat1);
        System.out.println("s1 == s2? " + strEq); // false
    }
}