package by.epam.unit05.main;

public class Task02 {
    public static void main(String[] args) {

    }

    public static double sum(double a, double b, double c) {

        double [] mas = {a, b, c};
        boolean sorted = false;
        double temp;
        while (!sorted) {
            sorted = true;
            for (int i = 0; i < mas.length - 1; i++) {
                if (mas[i] > mas[i + 1]) {
                    temp = mas[i];
                    mas[i] = mas[i + 1];
                    mas[i + 1] = temp;
                    sorted = false;
                }
            }
        }

        return mas[0] + mas[2];
    }
}
