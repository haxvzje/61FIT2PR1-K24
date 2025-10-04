package week4.pr1.arrays.exercises.number;

public class PerfectNumbers {
    public static void main(String[] args) {
        System.out.println("The four perfect numbers less than 10,000:");
        for (int n = 1; n <= 10000; n++) {
            if (isPerfectNumber(n)) {
                System.out.println(n);
            }
        }
    }

    public static boolean isPerfectNumber(int n) {
        int sum = 0;
        for (int i = 1; i <= n / 2; i++) {
            if (n % i == 0) {
                sum += i;
            }
        }
        return sum == n;
    }
}