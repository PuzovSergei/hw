package hw22112021;

import java.util.Random;

public class Hw_22112021_task_5_6 {

    static Random random = new Random();

    public static void main(String[] args) {

        //Задание №5:   Написать метод, принимающий на вход два аргумента: len и initialValue...;
        System.out.println("Задание №5");
        int len = 5;
        int initalValue = 10;
        task5(len, initalValue);
        System.out.println();

        //Задание №6:   Задать одномерный массив и найти в нем минимальный и максимальный элементы;
        System.out.println("Задание №6");
        task6(6);
    }

    public static int[] task5(int a, int b){
        int[] arr5 = new int[a];
        for (int i = 0; i < arr5.length; i++) {
            arr5[i] = b;
            System.out.printf("%-4d", arr5[i]);
        }
        return arr5;
    }

    public static void task6 (int size) {
        int[] arr6 = new int[size];

        for (int i = 0; i < arr6.length; i++) {
            arr6[i] = random.nextInt(200) - 100;
        }
        int max = arr6[0];
        int min = arr6[0];
        System.out.println("Вновь созданная таблица,состоящая из " + size + " элементов:");
        for (int i = 0; i < arr6.length; i++) {
            System.out.printf("%-5d", arr6[i]);}
        System.out.println();

        for (int i = 0; i < arr6.length; i++) {
            if (arr6[i] >= max) {
                max = arr6[i];}
            if (arr6[i] <= min) {
                min = arr6[i];
            }
        }
        System.out.println("Максимальный элемент = " + max);
        System.out.println("Минимальный элемент = " + min);
    }
}