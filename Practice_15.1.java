//@Override. Указывает, что метод переопределяет метод из суперкласса или реализует метод интерфейса

class Animal {
    public void speak() {}
}

class Dog extends Animal {
    @Override
    public void speak() {
        System.out.println("Гав!");
    }
}

//@Deprecated. Помечает метод, класс или поле как устаревшее

@Deprecated(since = "1.2", forRemoval = true)
public void oldMethod() {
    // старая реализация
}

//@SuppressWarnings. Подавляет конкретные предупреждения компилятора

@SuppressWarnings("unchecked")
public List<String> getList() {
    return (List<String>) someRawList; // подавляем предупреждение о небезопасном приведении
}