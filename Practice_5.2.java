//Приведите все способы создания экземпляра класса Boolean.
public class BooleanCreation {
    public static void main(String[] args) {
        // 1. Автоупаковка (boxing) — рекомендуемый способ
        Boolean b1 = true;
        Boolean b2 = false;

        // 2. Статический метод valueOf(boolean)
        Boolean b3 = Boolean.valueOf(true);
        Boolean b4 = Boolean.valueOf(false);

        // 3. Статический метод valueOf(String)
        Boolean b5 = Boolean.valueOf("true");     // true
        Boolean b6 = Boolean.valueOf("True");     // true (регистронезависимо)
        Boolean b7 = Boolean.valueOf("yes");      // false (только "true" → true)
        Boolean b8 = Boolean.valueOf("anything"); // false

        // 4. Нельзя через new Boolean() — deprecated и не рекомендуется
        // Boolean b9 = new Boolean(true); // работает, но устарело

        // 5. Нельзя через parseBoolean — он возвращает boolean, а не Boolean!
        boolean primitive = Boolean.parseBoolean("true"); // тип — boolean, не Boolean

        System.out.println("b1=" + b1 + ", b5=" + b5 + ", b7=" + b7);
    }
}