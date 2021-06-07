package by.epam.unit05.main;

public class Task03 {
    public static void main(String[] args) {

        double a = 1.322345;
        double b = 1322345;


        double example = maxNumber(1.32234523, 132234);

        System.out.println(example);
    }

    public static double maxNumber(double a, double b) {
        int lengthOfA;
        if ((a % 1) > 0) {
            lengthOfA = String.valueOf(a).length() - 1;
        } else {
            lengthOfA = String.valueOf(a).length() - 2;
        }

        int lengthOfB;
        if ((b % 1) > 0) {
            lengthOfB = String.valueOf(b).length() - 1;
        } else {
            lengthOfB = String.valueOf(b).length() - 2;
        }

        if (lengthOfA > lengthOfB) {
            return a;
        } else {
            return b;
        }
   }
}
