//Практика #1

//Исключения обрабатываются одинаково
try {
    // код, который может вызвать разные исключения
    Integer.parseInt("abc");        // NumberFormatException
    int[] arr = new int[-5];        // NegativeArraySizeException
} catch (NumberFormatException | NegativeArraySizeException e) {
    System.out.println("Ошибка ввода данных: " + e.getMessage());
}

//Исключения образуют иерархию
try {
    int a = 10 / 0; // ArithmeticException
} catch (ArithmeticException e) {
    System.out.println("Деление на ноль: " + e.getMessage());
} catch (RuntimeException e) {
    System.out.println("Ошибка времени выполнения: " + e.getMessage());
} catch (Exception e) {
    System.out.println("Общая ошибка: " + e.getMessage());
}

//Практика #2

//Ключевое слово final означает, что ссылка e не может быть изменена внутри блока catch - её нельзя переприсвоить.