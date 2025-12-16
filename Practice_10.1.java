//Приведите примеры использования перегрузки и переопределения методов.

//Перегрузка методов
class Calculator {
    // Перегрузка: разное количество аргументов
    int add(int a, int b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }

    // Перегрузка: другой тип аргумента
    double add(double a, double b) {
        return a + b;
    }
}

//Переопределение метода
class Animal {
    public void makeSound() {
        System.out.println("Животное издаёт звук");
    }
}

class Dog extends Animal {
    @Override // аннотация для явного указания переопределения
    public void makeSound() {
        System.out.println("Гав-гав!");
    }
}
