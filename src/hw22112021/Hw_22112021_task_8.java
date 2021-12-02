package hw22112021;

import java.util.Random;

import static java.lang.Math.abs;

public class Hw_22112021_task_8 {

    static Random random = new Random();
    public static void main(String[] args) {

        //Задание №8:   метод должен сместить все элементы массива на n позиций;
        // не осилил, по ходу без ещё одной таблицы здесь не обойтись...

        System.out.println("Задание №8");
        move(10, 2);
    }

    public static void move ( int size, int n) {
        int[] arr8 = new int[size];
        for (int i = 0; i < arr8.length; i++) {
            arr8[i] = random.nextInt(5);
        }
        System.out.println("Вновь созданная таблица,состоящая из " + size + " элементов:");
        for (int i = 0; i < arr8.length; i++) {
            System.out.printf("%-5d", arr8[i]);
        }
        System.out.println();

        if (n > 0) {

            for (int i = size - 1; i > n - 1; i--) {
                int index = abs(i + n);//
                int index1 = abs(i + n - size);//

                if (index < size) {//

                    arr8[index] = arr8[i];//
                } else {
                    arr8[index1] = arr8[i];
                }
            }
        }
        for (int i = 0; i < arr8.length; i++) {
            System.out.printf("%-5d", arr8[i]);
        }
    }
}