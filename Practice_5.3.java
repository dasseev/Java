//В каком случае при автоупаковке/автораспаковке будет брошено исключение NullPointerException. Приведите пример.
//Исключение никогда не бросается при упаковке (int → Integer). NullPointerException возникает при распаковке null-объекта
public class UnboxingNPE {
    public static void main(String[] args) {
        Integer nullable = null;

        // Попытка распаковать null → NPE
        try {
            int value = nullable; // ← авто-распаковка: вызывает nullable.intValue()
        } catch (NullPointerException e) {
            System.out.println("NPE при распаковке null: " + e.getMessage());
        }

        // То же самое с другими типами
        Double d = null;
        try {
            double x = d; // NPE
        } catch (NullPointerException e) {
            System.out.println("NPE с Double");
        }
    }
}