//Приведите примеры "вложение" класса в интерфейс и покажите способ вызова методе такого вложенного класса.

//пример
public interface MyInterface {
    // Вложенный класс в интерфейсе
    class Helper {
        public static void print() {
            System.out.println("Сообщение из вложенного класса в интерфейсе");
        }

        public void log() {
            System.out.println("Это нестатический метод");
        }
    }
}

//вызов
public class Main {
    public static void main(String[] args) {
        // Вызов статического метода
        MyInterface.Helper.print();

        // Создание экземпляра и вызов нестатического метода
        MyInterface.Helper helper = new MyInterface.Helper();
        helper.log();
    }
}