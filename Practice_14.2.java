//Приведите пример кода, демонстрирующего все три варианта использования ключевого слова super.

class Parent {
    int value = 10;

    Parent() {
        System.out.println("Конструктор Parent");
    }

    void show() {
        System.out.println("Метод Parent, value = " + value);
    }
}

class Child extends Parent {
    int value = 20;

    // 1. Вызов конструктора суперкласса
    Child() {
        super(); // вызов Parent()
        System.out.println("Конструктор Child");
    }

    void display() {
        // 2. Доступ к полю суперкласса
        System.out.println("Поле суперкласса: " + super.value);
        // 3. Вызов метода суперкласса
        super.show();
    }
}

//Что случится при вызове метода method() объекта класса C, если переменная a и метод method() не будут определены в классе B, 
//а будут определены только в классе A?

/*Ничего не сломается, код выполнится корректно.

Класс C наследуется от B, а B от A.
Наследование транзитивно: C получает доступ ко всем не-private членам A, даже если они не переопределены в B.
Поэтому super.a и super.method() в классе C ссылаются на члены класса A, и вызов проходит успешно. */

//Перепешите следующий код с использованием конструкции this(). 
//Помните, что в каждом конструкторе вызов this() должен быть единственным и первым среди всех операций.

class A {
    int a;
    int b;
    int c;
    int z;

    public A() {
        this(0); // вызывает A(int a)
    }

    public A(int a) {
        this(a, 0); // вызывает A(int a, int b)
    }

    public A(int a, int b) {
        this(a, b, 0); // вызывает A(int a, int b, int c)
    }

    public A(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
        this.z = 1;
    }
}