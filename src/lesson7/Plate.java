package lesson7;

public class  Plate {
    private int food;

    public Plate(int food) {
        this.food = food;
    }

    public boolean decreaseFood(int amount) {
        if (food >= amount) {
            food -= amount;
            return true;
        } else {
            return false;
        }
    }

    public int getFood() {return food; }

    public boolean addFood(int amount){
        if (amount < 0) {
            return false;
        } else {
            food += amount;
            return true;
        }
    }
}

