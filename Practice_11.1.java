//Приведите примеры использования оператора instanceof с объектами параметризованных классов.

List<String> list = new ArrayList<>();
if (list instanceof List) {        // правильно
    // ...
}

// if (list instanceof List<String>) { } // ошибка компиляции

Wrapper<Integer> w = new Wrapper<>();
if (w instanceof Wrapper) { }      // норм
// if (w instanceof Wrapper<Integer>) { } // нельзя

//Приведите примеры использования конструкций <? extends T> и <? super T>. Объясните, зачем они нужны?

public double sum(List<? extends Number> list) {
    double s = 0;
    for (Number n : list) s += n.doubleValue();
    return s;
}
// Передать можно: List<Integer>, List<Double> и т.д.

public void addInts(List<? super Integer> list) {
    list.add(10);  // можно добавлять Integer
}
// Передать можно: List<Integer>, List<Number>, List<Object>