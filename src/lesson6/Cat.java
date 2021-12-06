package lesson6;

public class Cat extends Animal{
    public static int CatCount;

    public Cat(String name, int maxDistanceSwim, int maxDistanceRun) {
        this.name = name;
        this.maxDistanceSwim = maxDistanceSwim;
        this.maxDistanceRun = maxDistanceRun;
        CatCount++;
    }
    public static int getCatCount() {
        return CatCount;
    }
}
