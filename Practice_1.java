// Пример соблюдения принципа подстановки Лисков
abstract class Bird {
    public abstract void move();
}

class Sparrow extends Bird {
    @Override
    public void move() {
        System.out.println("Воробей летит");
    }
}

class Penguin extends Bird {
    @Override
    public void move() {
        System.out.println("Пингвин плывёт");
    }
}

class BirdHandler {
    public void makeBirdMove(Bird bird) {
        bird.move(); // Работает для любого подкласса Bird
    }
}

public class LiskovExample {
    public static void main(String[] args) {
        BirdHandler handler = new BirdHandler();
        handler.makeBirdMove(new Sparrow());  // Воробей летит
        handler.makeBirdMove(new Penguin());  // Пингвин плывёт
    }

}
