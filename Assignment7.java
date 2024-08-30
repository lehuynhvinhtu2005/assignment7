package assignment7;

import java.util.Scanner;
import java.util.Arrays;

public class Assignment7 {

    public static void importdata(float[] array) {
        Scanner keyboard = new Scanner(System.in);
        for (int i = 0; i < array.length; i++) {
            System.out.print("Phan tu thu " + (i + 1) + " la: ");
            array[i] = keyboard.nextInt();
        }
    }

    public static void printdata(float[] array) {
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
        System.out.println();
    }

    public static float findmax2(float[] array) {
        Arrays.sort(array);
        return array[array.length - 2];
    }

    public static void deleteOddNumber(float[] array) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                array[i] = 0;
            }
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] != 0) {
                System.out.print(array[i] + " ");
            }
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        System.out.print("So phan tu la: ");
        int n = keyboard.nextInt();
        float[] number = new float[n];
        importdata(number);
        System.out.print("Mang sau khi nhap: ");
        printdata(number);
        System.out.println("Phan tu lon thu 2 cua mang la: " + findmax2(number));
        deleteOddNumber(number);
    }

}
