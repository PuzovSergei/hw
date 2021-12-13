package lesson7;


public class Main {
    public static void main(String[] args) {

        Cat[] cats = new Cat[] {
                new Cat ("Barsik1"),
                new Cat ("Barsik2"),
                new Cat ("Barsik3"),
                new Cat ("Barsik4"),
                new Cat ("Barsik5")
        };

        Plate plate = new Plate(33);

        for (int i = 0; i < cats.length; i++) {
            cats[i].eat(plate);
        }
        for (int i = 0; i < cats.length; i++) {
            System.out.println(cats[i]);
        }
    }
}
