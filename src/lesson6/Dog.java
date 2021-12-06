package lesson6;

public class Dog extends Animal{
    private static int DogCount;

    public Dog(String name, int maxDistanceSwim, int maxDistanceRun) {
        this.name = name;
        this.maxDistanceSwim = maxDistanceSwim;
        this.maxDistanceRun = maxDistanceRun;
        DogCount++;
    }
    public static int getDogCount(){
        return DogCount;
    }
}
