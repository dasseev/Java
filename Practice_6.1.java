//Какого типа может быть переменная в switch? Приведите примеры для всех возможных случаев.
public class SwitchTypesExample {
    enum Color { RED, GREEN, BLUE }

    public static void main(String[] args) {
        // 1. int
        int intValue = 2;
        switch (intValue) {
            case 1 -> System.out.println("int: 1");
            case 2 -> System.out.println("int: 2");
        }

        // 2. byte
        byte byteValue = 100;
        switch (byteValue) {
            case 100 -> System.out.println("byte: 100");
        }

        // 3. short
        short shortValue = 500;
        switch (shortValue) {
            case 500 -> System.out.println("short: 500");
        }

        // 4. char
        char charValue = 'X';
        switch (charValue) {
            case 'X' -> System.out.println("char: X");
        }

        // 5. String
        String str = "Java";
        switch (str) {
            case "Java" -> System.out.println("String: Java");
        }

        // 6. enum
        Color color = Color.RED;
        switch (color) {
            case RED -> System.out.println("Color: RED");
        }

        // 7. Wrapper (auto-unboxing)
        Integer wrapped = 42;
        switch (wrapped) {
            case 42 -> System.out.println("Integer: 42");
        }
    }
}