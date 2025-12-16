//Практика #1

// Интерфейс
public interface Drawable {
    // default-метод (неабстрактный)
    default void draw() {
        System.out.println("Рисуем фигуру");
    }

    // статический метод
    static void info() {
        System.out.println("Это интерфейс Drawable");
    }
}

// Реализующий класс
class Circle implements Drawable {
    // можно переопределить default-метод
    @Override
    public void draw() {
        System.out.println("Рисуем круг");
    }
}

//вызов
public class Main {
    public static void main(String[] args) {
        Circle c = new Circle();

        // 1. Вызов default-метода через объект
        c.draw(); // "Рисуем круг"

        // 2. Вызов static-метода через имя интерфейса
        Drawable.info(); // "Это интерфейс Drawable"

        // 3. Вызов default-метода через объект даже без переопределения
        Drawable d = new Circle();
        d.draw(); // "Рисуем круг"
    }
}

//Практика #2

//пример
interface A {
    default void greet() {
        System.out.println("Привет из A");
    }
}

interface B {
    default void greet() {
        System.out.println("Привет из B");
    }
}

//ошибка: "inherits unrelated defaults for greet() from A and B"
class C implements A, B {
}

//решение
class C implements A, B {
    @Override
    public void greet() {
        // Вариант 1: использовать реализацию из A
        A.super.greet();

        // Вариант 2: использовать реализацию из B
        B.super.greet();

        // Вариант 3: своя реализация
        System.out.println("Привет из C");
    }
}