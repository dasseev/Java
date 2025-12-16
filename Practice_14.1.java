//Приведите пример кода, демонстрирующего невозможность переопределять в подклассе final-метод суперкласса.

class Parent {
    public final void show() {
        System.out.println("Это final-метод");
    }
}

class Child extends Parent {
    // Попытка переопределить final-метод вызовет ошибку:
    // public void show() { }  // Cannot override the final method
}

//Приведите пример кода, демонстрирующего невозможность использовать наследование для final-класса.

final class FinalClass {
    public void method() {
        System.out.println("Метод final-класса");
    }
}

// Попытка наследования вызовет ошибку:
// class SubClass extends FinalClass { }  // Cannot inherit from final 'FinalClass'
