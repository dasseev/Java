//Приведите примеры, когда арифметические операции выполняются с переменными различных типов. Объясните результат.
public class ArithmeticPromotion {
    public static void main(String[] args) {
        byte b = 10;
        short s = 20;
        int i = 30;
        long l = 40L;
        float f = 50.0f;
        double d = 60.0;

        // byte + short - int
        int result1 = b + s; // результат - int
        System.out.println("byte + short = " + result1); // 30

        // int + long - long
        long result2 = i + l;
        System.out.println("int + long = " + result2); // 70

        // long + float - float
        float result3 = l + f;
        System.out.println("long + float = " + result3); // 90.0

        // float + double - double
        double result4 = f + d;
        System.out.println("float + double = " + result4); // 110.0
    }
}

//Java автоматически выполняет расширяющее преобразование к типу с большим диапазоном, согласно цепочке:
//byte - short - int - long - float - double

