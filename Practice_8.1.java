//Что произойдет в результате выполнения следующего кода?
int a1[] = {1,2,3,4,5};
int a2[] = {6,7,8,9,10};
a1 = a2;
//После присваивания a1 = a2 обе переменные (a1 и a2) будут ссылаться на один и тот же массив — тот, который был создан как {6,7,8,9,10}.
//Исходный массив {1,2,3,4,5} потеряет все ссылки и станет недоступен (позже будет удалён сборщиком мусора).
//Теперь изменение элемента через a1 повлияет и на a2, и наоборот, потому что это один и тот же объект в памяти.

/*Самостоятельно изучите класс java.util.Array и приведите пример использования следующих методов:

String toString(...)
int binarySearch(...)
boolean equals(...)
boolean compare(...)
void sort(...) */

import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int[] arr1 = {3, 1, 4, 1, 5};
        int[] arr2 = {3, 1, 4, 1, 5};
        int[] arr3 = {1, 3, 4, 5, 9};

        // toString — преобразует массив в читаемую строку
        System.out.println("Массив: " + Arrays.toString(arr1)); 
        // Вывод: [3, 1, 4, 1, 5]

        // sort — сортирует массив по возрастанию
        Arrays.sort(arr1);
        System.out.println("После сортировки: " + Arrays.toString(arr1)); 
        // Вывод: [1, 1, 3, 4, 5]

        // binarySearch — ищет индекс элемента (массив должен быть отсортирован!)
        int index = Arrays.binarySearch(arr1, 3);
        System.out.println("Индекс 3: " + index); // Вывод: 2

        // equals — сравнивает содержимое двух массивов
        boolean same = Arrays.equals(arr1, arr2);
        System.out.println("arr1 == arr2? " + same); // false (arr2 не отсортирован)

        Arrays.sort(arr2);
        System.out.println("После сортировки arr2: " + Arrays.equals(arr1, arr2)); // true

        // compare — сравнивает два массива лексикографически (начиная с Java 9)
        int cmp = Arrays.compare(arr1, arr3);
        System.out.println("Сравнение arr1 и arr3: " + cmp); // -1 (arr1 < arr3)
    }
}