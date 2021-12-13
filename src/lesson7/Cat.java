package lesson7;

public class Cat {
    private String name;
    private boolean satiety;
    private final int APPETITE = 10;

    public Cat(String name) {
        this.name = name;
    }

    public boolean eat(Plate plate) {
        if (plate.decreaseFood(APPETITE)) {
            System.out.println("Catc " + name + " eat...");
            satiety = true;
            return true;
        } else {
            System.out.println("Catc " + name + " no eat...");
            return false;
        }
    }
    public String getName() {
        return name;
    }

    public boolean isSatiety() {
        return satiety;
    }

    @Override
    public String toString() {
        return "Cat{" +
                "name='" + name + '\'' +
                ", satiety=" + satiety +
                '}';
    }
}
