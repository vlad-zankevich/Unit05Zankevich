package by.epam.unit05.main;

public class Task01 {
    public static void main(String[] args) {
    }

    public static int nod (int a, int b) {

        while (a != 0 && b != 0) {
            if (a > b) {
                a = a % b;
            } else {
                b = b % a;
            }
        }

        return a + b;
    }

    public static int nok(int a, int b) {

        return (a * b) / nod(a, b);
    }
}


