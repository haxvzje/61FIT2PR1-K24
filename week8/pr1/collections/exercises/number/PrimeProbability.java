package week8.pr1.collections.exercises.number;

import java.util.Random;

public class PrimeProbability {
    public static void main(String[] args) {
        Random random = new Random();
        int primeNumberCount = 0;

        for (int i = 0; i < 100; i++) {
            int randomNumber = random.nextInt(1000 - 2) + 2;
            int index = (int) (Math.sqrt(randomNumber) + 1);
            if (isPrime(randomNumber, index)) primeNumberCount++;
        }

        System.out.printf("Among %d random integers, %d are prime numbers", 100, primeNumberCount);
        System.out.print("\nProbability is " + primeNumberCount + "%");
    }

    public static boolean isPrime(int n, int i) {
        if (i == 1 || i == 2) return true;
        if (n % i == 0) return false;
        return isPrime(n, i - 1);
    }
}
