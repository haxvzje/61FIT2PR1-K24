package week9.pr1.algorithms.exercises.sort;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class ArrayIntersectionDemo {

    public static void main(String[] args) {

        Integer[] arrayA = {7, 1, 5, 2, 3, 6};
        Integer[] arrayB = {3, 8, 6, 20, 7};
        Integer[] arrayX = {1, 2, 3};
        Integer[] arrayY = {4, 5, 6};

        Set<Integer> setC = intersect(arrayA, arrayB);
        Set<Integer> setZ = intersect(arrayX, arrayY);

        System.out.println("A: " + Arrays.toString(arrayA));
        System.out.println("B: " + Arrays.toString(arrayB));
        System.out.println("C: " + setC);
        System.out.println("X: " + Arrays.toString(arrayX));
        System.out.println("Y: " + Arrays.toString(arrayY));
        System.out.println("Z: " + setZ);
    }

    public static Set<Integer> intersect(Integer[] A, Integer[] B) {
        if (A.length > B.length) {
            Integer[] temp = A;
            A = B;
            B = temp;
        }

        Set<Integer> setB = new HashSet<>(Arrays.asList(B));
        Set<Integer> C = new HashSet<>();

        for (Integer x : A) {
            if (setB.contains(x)) {
                C.add(x);
            }
        }

        return C;
    }
}