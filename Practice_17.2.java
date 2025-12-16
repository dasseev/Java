//Практика #1

public class MutableStrings {
    public static void main(String[] args) {
        StringBuilder sb = new StringBuilder("Hello");

        // 1. append() — добавляет строку в конец
        sb.append(" World");
        System.out.println("1. append: " + sb);

        // 2. insert(int offset, String str) — вставляет строку по индексу
        sb.insert(5, ",");
        System.out.println("2. insert: " + sb); // Hello, World

        // 3. delete(int start, int end) — удаляет символы в диапазоне
        sb.delete(5, 6); // удаляем запятую
        System.out.println("3. delete: " + sb);

        // 4. deleteCharAt(int index) — удаляет символ по индексу
        sb.deleteCharAt(sb.length() - 1); // удаляем 'd'
        System.out.println("4. deleteCharAt: " + sb);

        // 5. replace(int start, int end, String str) — заменяет подстроку
        sb.replace(0, 5, "Hi");
        System.out.println("5. replace: " + sb);

        // 6. reverse() — разворачивает строку
        sb.reverse();
        System.out.println("6. reverse: " + sb);

        // 7. setCharAt(int index, char ch) — заменяет символ по индексу
        sb.setCharAt(0, 'x');
        System.out.println("7. setCharAt: " + sb);

        // 8. setLength(int newLength) — изменяет длину (усекает или дополняет нулями)
        sb.setLength(5);
        System.out.println("8. setLength: " + sb);

        // 9. capacity() — возвращает текущую ёмкость буфера
        System.out.println("9. capacity: " + sb.capacity());

        // 10. toString() — преобразует в неизменяемую строку
        String result = sb.toString();
        System.out.println("10. toString: " + result);
    }
}

//Практика #2

// Из String - StringBuilder / StringBuffer
String str = "text";
StringBuilder sb = new StringBuilder(str);
StringBuffer sbf = new StringBuffer(str);

// Из StringBuilder - String / StringBuffer
String str1 = sb.toString();
StringBuffer sbf1 = new StringBuffer(sb.toString());

// Из StringBuffer - String / StringBuilder
String str2 = sbf.toString();
StringBuilder sb2 = new StringBuilder(sbf.toString());
