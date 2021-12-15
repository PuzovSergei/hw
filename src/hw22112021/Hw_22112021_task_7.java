package hw22112021;

import java.util.Random;

public class Hw_22112021_task_7 {
    static Random random = new Random();

    public static void main(String[] args) {

        //Задание №7:   метод должен вернуть true, если в массиве есть место, в котором сумма левой и правой части массива равны;
        System.out.println("Задание №7");
        System.out.println(checkBalance(4));
    }

    public static boolean checkBalance ( int size){
        int[] arr7 = new int[size];
        for (int i = 0; i < arr7.length; i++) {
            arr7[i] = random.nextInt(5);
        }
        System.out.println("Вновь созданная таблица,состоящая из " + size + " элементов:");
        for (int i = 0; i < arr7.length; i++) {
            System.out.printf("%-5d", arr7[i]);
            }
            System.out.println();

            int count = 0;
            boolean b;

            for (int index = 0; index < arr7.length; index++) {
                int sumLeft = 0;
                int sumRight = 0;
                for (int j = 0; j < index; j++) {
                    sumLeft += arr7[j];
                }
                for (int k = index; k < arr7.length; k++) {
                    sumRight += arr7[k];
                }
                if (sumLeft == sumRight) {
                    count += 1;
                }
            }
        if (count > 0) {
            b = true;
        } else {
            b = false;
        }
        return b;
    }
}
