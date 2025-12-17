//Практика #1

/*
Throwable - Корневой класс всей иерархии исключений. От него наследуются все ошибки и исключения.
Error - Предназначен для критических ошибок виртуальной машины, которые не подлежат обработке (например, OutOfMemoryError, StackOverflowError)
Exception - Базовый класс для всех обрабатываемых исключений. Делится на:<br>– проверяемые (checked) — компилятор требует try-catch или throws;<br>– непроверяемые — наследники RuntimeException.
RuntimeException - Представляет логические ошибки: деление на ноль, выход за границы массива и т.д. Они не проверяются на этапе компиляции и могут возникать в любом месте. */

//Практика #2

public class ExceptionsExample {
    public static void main(String[] args) {
        // 1. ArithmeticException — деление на ноль
        try {
            int result = 10 / 0;
        } catch (ArithmeticException e) {
            System.out.println("Деление на ноль: " + e.getMessage());
        }

        // 2. ArrayIndexOutOfBoundsException — выход за границы массива
        try {
            int[] arr = {1, 2, 3};
            int x = arr[10];
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Выход за границы массива: " + e.getMessage());
        }

        // 3. IllegalArgumentException — недопустимый аргумент
        try {
            validateAge(-5);
        } catch (IllegalArgumentException e) {
            System.out.println("Некорректный аргумент: " + e.getMessage());
        }

        // 4. ClassCastException — ошибка приведения типов
        try {
            Object obj = "текст";
            Integer num = (Integer) obj; // нельзя привести String к Integer
        } catch (ClassCastException e) {
            System.out.