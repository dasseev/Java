//Практика #1

import java.io.FileInputStream;
import java.io.IOException;

public class InputStreamExample {
    public static void main(String[] args) {
        try (FileInputStream fis = new FileInputStream("input.txt")) {
            int byteData;
            // read() возвращает -1 при достижении конца файла
            while ((byteData = fis.read()) != -1) {
                System.out.print((char) byteData); // выводим как символ
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//Практика #2

import java.io.FileOutputStream;
import java.io.IOException;

public class OutputStreamExample {
    public static void main(String[] args) {
        try (FileOutputStream fos = new FileOutputStream("output.txt")) {
            // write(int b) записывает младший байт аргумента
            fos.write('H'); // 72
            fos.write('i'); // 105
            fos.write('\n');
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

//Практика #3

/*InputStream/OutputStream работают с байтами (8 бит) — подходят для бинарных данных (изображения, аудио).
Reader/Writer работают с символами (Unicode, обычно UTF-16) — подходят для текста. */

//Практика #4

/*Интерфейс AutoCloseable позволяет автоматически закрывать ресурсы (файлы, сокеты, потоки) с помощью try-with-resources. 
Это гарантирует, что ресурс будет закрыт даже при возникновении исключения. */

import java.io.FileInputStream;
import java.io.IOException;

public class AutoCloseableExample {
    public static void main(String[] args) {
        // Поток автоматически закроется после выхода из блока
        try (FileInputStream fis = new FileInputStream("file.txt")) {
            int data = fis.read();
            System.out.println((char) data);
        } catch (IOException e) {
            e.printStackTrace();
        }
        // fis.close() вызван автоматически
    }
}