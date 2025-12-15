//Что означает type interface и приведите пример с использование var.
//Type inference - возможность компилятора автоматически определять тип переменной на основе инициализатора.
public class VarExample {
    public static void main(String[] args) {
        var name = "Java";           // тип: String
        var age = 25;                // тип: int
        var price = 19.99;           // тип: double
        var list = new ArrayList<String>(); // тип: ArrayList<String>

        System.out.println(name + " — возраст: " + age + ", цена: " + price);
    }
}