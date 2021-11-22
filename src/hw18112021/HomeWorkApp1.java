package hw18112021;

import java.io.PrintWriter;
import java.util.Scanner;

public class HomeWorkApp1 {
    public static void main(String[] args) {
        Scanner in = new Scanner((System.in));
        PrintWriter out = new PrintWriter(System.out);

        System.out.println("Task №1. Input 2 numbers: ");
        int a = in.nextInt();
        int b = in.nextInt();
        Task1(a,b);
        System.out.println(Task1(a,b));

        System.out.println("Task №2. Input number: ");
        int c = in.nextInt();
        Task2(c);

        System.out.println("Task №3. Input number: ");
        int d = in.nextInt();
        Task3(d);
        System.out.println(Task3(d));

        System.out.println("Task №4. Input number: ");
        int e = in.nextInt();
        String name = "Привет";
        Task4(e, name);

        System.out.print("Task №5. Input the year: ");
        int g = in.nextInt();
        Task5(g);
        System.out.println(Task5(g));
    }

    public static boolean Task1 (int a,int b ) {
        return a + b >= 10 && a + b <= 20;
    }

    public static void Task2 (int a) {
        if (a >= 0) {
            System.out.println("Положительное число");
        } else {
            System.out.println("Отрицательное число");
        }
    }
    public static boolean Task3 (int a){
        return a < 0 ;
    }

    public static void Task4 (int a, String b){
        for (int i = 1; i <=a; i++){
            System.out.println(b);
        }
    }
    public static boolean Task5 (int a) {
        if((a % 400 == 0) || ((a % 4 == 0) && (a % 100 != 0))) {return true;}
        return false;
    }
}

