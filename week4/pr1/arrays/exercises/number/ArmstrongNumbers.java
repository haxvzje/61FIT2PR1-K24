package week4.pr1.arrays.exercises.number;

public class ArmstrongNumbers {
    public static void main(String[] args) {
        System.out.println("Armstrong numbers between 100 and 999:");

        for (int n = 100; n <= 999; n++) {
            int hundreds = n / 100;
            int tens = (n / 10) % 10;
            int units = n % 10;

            int sum = hundreds * hundreds * hundreds + tens * tens * tens + units * units * units;

            if (sum == n) {
                System.out.println(n);
            }
        }
    }
}
