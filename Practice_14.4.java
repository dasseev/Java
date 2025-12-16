//ПСамостоятельно придумайте класс и переопределите для него метод equals(). Каким соглашениям должна следовать реализация этого метода?

public class Point {
    private int x;
    private int y;

    public Point(int x, int y) {
        this.x = x;
        this.y = y;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;               // 1. Сравнение ссылок
        if (obj == null || getClass() != obj.getClass()) return false; // 2. null и тип

        Point p = (Point) obj;
        return x == p.x && y == p.y;               // 3. Сравнение полей
    }
}

/*Метод equals() обязан удовлетворять следующим свойствам:

Рефлексивность: x.equals(x) - true
Симметричность: если x.equals(y) == true, то y.equals(x) == true
Транзитивность: если x.equals(y) == true и y.equals(z) == true, то x.equals(z) == true
Непротиворечивость: повторные вызовы возвращают один и тот же результат (если объект не изменялся)
x.equals(null) - false */