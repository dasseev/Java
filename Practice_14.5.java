//Приведите примеры использования различных спецификаторов доступа для внутренних классов и объясните их поведение.

public class Outer {
    // Доступен из любого класса
    public class PublicInner {}

    // Доступен только внутри пакета
    class PackagePrivateInner {}

    // Доступен из подклассов и пакета
    protected class ProtectedInner {}

    // Доступен только из внешнего класса
    private class PrivateInner {}
}

/*public - можно создавать из любого места:
new Outer().new PublicInner();
package-private - только из классов того же пакета.
protected - из того же пакета и из подклассов Outer (даже в других пакетах).
private - только из самого Outer, извне - нельзя.
 */

//Имеет ли внутренний класс доступ к полям и методам внешнего класса? Как возможность доступа зависит от спецификаторов доступа? 
// Приведите примеры кода.

//Да, внутренний класс имеет прямой доступ ко всем полям и методам внешнего класса - независимо от их спецификаторов

public class Outer {
    private int secret = 42;

    public class Inner {
        public void reveal() {
            System.out.println(secret); // Доступ к private-полю внешнего класса
        }
    }
}

//Имеет ли внешний класс доступ к полям и методам внутреннего класса? Как возможность доступа зависит от спецификаторов доступа? 
// Приведите примеры кода.

//Да, внешний класс может обращаться к членам внутреннего класса, но подчиняясь их спецификаторам доступа.

public class Outer {
    public void accessInner() {
        Inner inner = new Inner();

        inner.publicField = 1;        // норм
        inner.protectedField = 2;     // норм, если в том же пакете
        inner.packageField = 3;       // норм, если в том же пакете
        // inner.privateField = 4;    // норм, если private
    }

    public class Inner {
        public int publicField;
        protected int protectedField;
        int packageField;
        private int privateField;
    }
}