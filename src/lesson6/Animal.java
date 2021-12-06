package lesson6;

public class Animal {
    String name;
    int maxDistanceSwim;
    int maxDistanceRun;
    private static int countInstance;

    public Animal() {
        countInstance++;
    }

    public static int getInstanceCount() {
        return countInstance;
    }

    public void run(int distance){
        if (maxDistanceRun == 0) {
            System.out.println(name + " не умеет бегать");
        } else
            if (distance <= maxDistanceRun) {
            System.out.println(name + " run " + distance + "м");
        } else {
            System.out.println(name + " не может бегать по " + distance + " метров за один раз");
        }
    }
    public void swim(int distance){
        if (maxDistanceSwim == 0) {
            System.out.println(name + " не умеет плавать");
        } else
            if (distance <= maxDistanceSwim) {
            System.out.println(name + " swim " + distance + "м");
        } else {
            System.out.println(name + " не может плавать по " + distance + " метров за один раз");
        }
    }
}
