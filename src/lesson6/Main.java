package lesson6;

public class Main {
    public static void main(String[] args) {

        Cat cat = new Cat("Мурзик", 0,200);
        Dog dog = new Dog("Бобик", 10,500);
        Dog dog1 = new Dog("Шарик", 10,500);

        cat.run(150);
        dog.run(150);
        cat.swim(150);
        dog.swim(150);
        dog1.run(600);

        printCountAnimal();
        printCountDog();
        printCountCat();
    }
    public static void printCountDog(){
        System.out.println("Количество собак - " + Dog.getDogCount());
    }
    public static void printCountCat(){
        System.out.println("Количество кошек - " + Cat.getCatCount());
    }
    public static void printCountAnimal(){
        System.out.println("Количество животных - " + Animal.getInstanceCount());
    }
}
