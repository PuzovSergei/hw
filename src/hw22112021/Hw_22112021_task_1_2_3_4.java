package hw22112021;

import java.util.Random;

public class Hw_22112021_task_1_2_3_4 {

    public static void main(String[] args) {

        //Задание №1:С помощью цикла и условия заменить 0 на 1, 1 на 0;
        System.out.println("Задание №1");
        int[] arr1 = new int[]{1,1,1,1,1,0,0,0,0,0,};
        System.out.println("Первоначальный вариант таблицы:");
        for (int i = 0; i < arr1.length; i++) {
            System.out.printf("%-4d", arr1[i]);
        }
        System.out.println();
        System.out.println("Измененная таблица:");
        for (int i = 0; i < arr1.length; i++) {
            if (arr1[i] == 0){
                arr1[i] = 1;
            } else arr1[i] *= 0;
            System.out.printf("%-4d", arr1[i]);
        }
        System.out.println();

        //Задание №2: С помощью цикла заполнить пустой целочисленный массив значениями 1 2 3 4 5 6 7 8 … 100;
        System.out.println("Задание №2");
        int[] arr2 = new int[100];
        for (int i = 0; i < arr2.length; i++) {
            arr2[i] = i + 1;
            System.out.print(arr2[i] + " ");
        }
        System.out.println();

        //Задание №3:  Пройти по массиву циклом, и числа меньшие 6 умножить на 2;
        System.out.println("Задание №3");
        int[] arr3 = new int[]{1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        System.out.println("Первоначальный вариант таблицы:");
        for (int i = 0; i < arr3.length; i++) {
            System.out.printf("%-4d", arr3[i]);
        }
        System.out.println();
        System.out.println("Измененная таблица:");
        for (int i = 0; i < arr3.length; i++) {
            if (arr3[i] <6){
                arr3[i] *= 2;
            }
            System.out.printf("%-4d", arr3[i]);
        }
        System.out.println();

        //Задание №4:   Создать квадратный двумерный целочисленный массив...;
        System.out.println("Задание №4");
        int[][] arr4 = new int[5][5];
        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4.length; j++) {
                if (arr4[i] == arr4[j])
                    arr4[i][j] = 1;
                if (i + j + 1 == arr4.length)
                    arr4[i][j] = 1;
                System.out.printf("%d", arr4[i][j]);
            }
            System.out.println();
        }
    }
}

