//Приведите примеры класса, в котором используется инициализация элементов перечисления.

public enum Planet {
    MERCURY(3.303e+23, 2.4397e6),
    VENUS(4.869e+24, 6.0518e6),
    EARTH(5.976e+24, 6.37814e6);

    private final double mass;    // масса в кг
    private final double radius;  // радиус в метрах

    Planet(double mass, double radius) {
        this.mass = mass;
        this.radius = radius;
    }

    public double getMass() { return mass; }
    public double getRadius() { return radius; }
}

//Приведите примеры реализации собственного перечисления c любым дополнительным методом.

public enum TrafficLight {
    RED("Остановиться"),
    YELLOW("Приготовиться"),
    GREEN("Ехать");

    private final String action;

    TrafficLight(String action) {
        this.action = action;
    }

    public String getAction() {
        return action;
    }

    // Собственный метод
    public void show() {
        System.out.println(name() + ": " + action);
    }
}