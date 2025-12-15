//Приведите примеры для всех типов данных. Примеры должны также включать нулевые значения.
public class PrimitiveTypesExample {
    // Поля класса (инициализируются значениями по умолчанию)
    static byte byteVal = 0;        // или (byte)0
    static short shortVal = 0;
    static int intVal = 0;
    static long longVal = 0L;
    static float floatVal = 0.0f;
    static double doubleVal = 0.0;
    static char charVal = '\u0000'; // нулевой символ
    static boolean boolVal = false;

    public static void main(String[] args) {
        // Локальные переменные
        byte b = 127;
        short s = 32767;
        int i = 2_147_483_647;
        long l = 9_223_372_036_854_775_807L;
        float f = 3.14f;
        double d = 2.71828;
        char c = 'A';
        boolean bool = true;

        System.out.println("byte: " + b + ", default: " + byteVal);
        System.out.println("short: " + s + ", default: " + shortVal);
        System.out.println("int: " + i + ", default: " + intVal);
        System.out.println("long: " + l + ", default: " + longVal);
        System.out.println("float: " + f + ", default: " + floatVal);
        System.out.println("double: " + d + ", default: " + doubleVal);
        System.out.println("char: '" + c + "', default: '\\u0000' (код " + (int)charVal + ")");
        System.out.println("boolean: " + bool + ", default: " + boolVal);
    }
}