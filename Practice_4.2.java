//Приведите примеры использования оператора instanceof. Отдельно рассмотрите случай, когда оператор применятся к null-объекту.
class Animal {}
class Dog extends Animal {}
class Cat extends Animal {}

public class InstanceofExample {
    public static void main(String[] args) {
        // Обычные объекты
        Animal myDog = new Dog();
        Animal myCat = new Cat();
        Animal generic = new Animal();

        // Проверка типов
        System.out.println("myDog instanceof Dog: " + (myDog instanceof Dog));     // true
        System.out.println("myDog instanceof Animal: " + (myDog instanceof Animal)); // true
        System.out.println("myCat instanceof Dog: " + (myCat instanceof Dog));     // false

        // Проверка с null
        Animal nullAnimal = null;
        System.out.println("nullAnimal instanceof Animal: " + (nullAnimal instanceof Animal)); // false

        // instanceof с интерфейсами (если бы были)
        // System.out.println(obj instanceof Runnable); // тоже работает

        // instanceof не компилируется, если типы несовместимы
        // String s = "test";
        // System.out.println(s instanceof Animal); // ошибка
    }
}