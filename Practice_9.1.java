//Самостоятельно изучите смысл каждого спецификатор доступа и приведите пример программы, демонстрирующей это. 
// Не забудьте про случай, когда спецификатор доступа отсутствует.

//BaseClass
package package1;

public class BaseClass {
    // Доступен только внутри BaseClass
    private int privateField = 1;

    // Доступен только в package1 (без спецификатора)
    int packagePrivateField = 2;

    // Доступен в package1 + подклассам (даже в других пакетах)
    protected int protectedField = 3;

    // Доступен везде
    public int publicField = 4;

    // Метод для демонстрации — доступен из любого места
    public void showOwnFields() {
        System.out.println("Внутри BaseClass:");
        System.out.println("private: " + privateField);           // норм
        System.out.println("package-private: " + packagePrivateField); // норм
        System.out.println("protected: " + protectedField);       // норм
        System.out.println("public: " + publicField);             // норм
    }
}

//SamePackageClass
package package1;

public class SamePackageClass {
    public void accessFields() {
        BaseClass obj = new BaseClass();
        // System.out.println(obj.privateField);     // ошибка: private
        System.out.println("package-private: " + obj.packagePrivateField); // норм
        System.out.println("protected: " + obj.protectedField);           // норм
        System.out.println("public: " + obj.publicField);                 // норм
    }
}

//OtherPackageClass
package package2;

import package1.BaseClass;

// Подкласс из другого пакета
class ChildClass extends BaseClass {
    public void accessInChild() {
        // System.out.println(privateField);      // недоступно даже в подклассе
        // System.out.println(packagePrivateField); // недоступно из другого пакета
        System.out.println("protected (из подкласса): " + protectedField); // норм
        System.out.println("public: " + publicField);                      // норм
    }
}

// Обычный класс из другого пакета
public class OtherPackageClass {
    public void accessFields() {
        BaseClass obj = new BaseClass();
        // System.out.println(obj.privateField);        // не норм
        // System.out.println(obj.packagePrivateField);  // не норм
        // System.out.println(obj.protectedField);       // не подкласс
        System.out.println("public: " + obj.publicField); // норм
    }
}