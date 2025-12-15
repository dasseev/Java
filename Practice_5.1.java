//Приведите примеры использования методы decode().
public class DecodeExample {
    public static void main(String[] args) {
        // Шестнадцатеричные (0x или #)
        Integer hex1 = Integer.decode("0xFF");   // 255
        Integer hex2 = Integer.decode("#FF");    // 255

        // Восьмеричные (начинаются с 0)
        Integer oct = Integer.decode("017");     // 15 (1*8 + 7)

        // Десятичные
        Integer dec = Integer.decode("123");     // 123

        // Long и Byte тоже поддерживают decode()
        Long big = Long.decode("0x1A");          // 26
        Byte small = Byte.decode("010");         // 8

        System.out.println("0xFF = " + hex1);
        System.out.println("#FF = " + hex2);
        System.out.println("017 (oct) = " + oct);
        System.out.println("123 = " + dec);
        System.out.println("0x1A (Long) = " + big);
        System.out.println("010 (Byte) = " + small);
    }
}