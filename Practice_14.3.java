//Приведите пример перегруженных методов.

class Calculator {
    int add(int a, int b) {
        return a + b;
    }

    double add(double a, double b) {
        return a + b;
    }

    int add(int a, int b, int c) {
        return a + b + c;
    }
}

//Приведите пример переопределенного метода. Что будет, 
//если у переопределенного и переопределяемого (из суперкласса) методов не будет совпадать тип возвращаемого значения?

class Animal {
    public void makeSound() {
        System.out.println("Животное издаёт звук");
    }
}

class Dog extends Animal {
    @Override
    public void makeSound() {               // норм, совпадает void
        System.out.println("Гав-гав!");
    }
}

/*Если тип совершенно другой (например, void - int) - ошибка компиляции.
Если тип - подтип (ковариантный возврат), то допустимо: */

class Parent {
    Object getValue() { return "hello"; }
}

class Child extends Parent {
    @Override
    String getValue() { return "world"; } // норм, String - подтип Object
}

//Приведите пример и объясните, когда использование аннотации @Override помогает обнаружить ошибку.

//без @Override
class Bird {
    public void fly() { }
}

class Penguin extends Bird {
    public void flay() { } 
}

//с @Override
class Penguin extends Bird {
    @Override
    public void flay() { } // ошибка: 
                           // "method does not override or implement a method from a supertype"
}