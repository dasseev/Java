//Приведите пример использования перегруженного оператора 
//+ с объектами типа String и переменными принадлежащим другим типам (объектам и базовым типам).
public class StringConcatExample {
    public static void main(String[] args) {
        String text = "Результат: ";

        // С базовыми типами
        System.out.println(text + 42);        // "Результат: 42"
        System.out.println(text + 3.14);      // "Результат: 3.14"
        System.out.println(text + true);      // "Результат: true"
        System.out.println(text + 'X');       // "Результат: X"

        // С объектами (вызывается toString())
        Integer num = 100;
        System.out.println(text + num);       // "Результат: 100"

        // Цепочка
        System.out.println(1 + 2 + " = " + (1 + 2)); // "3 = 3"
        System.out.println("Сумма: " + 1 + 2);       // "Сумма: 12"
    }
}