package by.epam.unit05.main;

import java.util.Random;

public class Task04 {

    public static void main(String[] args) {
        Random rand = new Random();
        int a = rand.nextInt(100);

        int[] d = new int[a + 30];

        for (int i = 0; i < d.length; i++) {
            d[i] = rand.nextInt(1000);
        }
        for (int i = 0; i < d.length; i++) {
            System.out.printf("%3d", d[i]);
            System.out.println();
        }
        System.out.println();
        System.out.println("Sum of three elements from k to m = " + sumOfThreeElements(8, d));
    }

    public static int sumOfThreeElements (int k, int[] d) {

        int sum = 0;
        for (int i = k; i < (k + 3); i++) {
            sum = sum + d[i];
        }

        return sum;
    }
}
