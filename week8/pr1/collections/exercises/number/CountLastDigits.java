package week8.pr1.collections.exercises.number;


import java.util.Arrays;

public class CountLastDigits {
    public static void main(String[] args) {
        int[] list = {9, 29, 44, 103, 2, 52, 12, 12, 76, 35, 20};
        System.out.println(Arrays.toString(countLastDigits(list)));
    }

    public static int[] countLastDigits(int[] list) {
        int[] result = new int[10];
        for (int i = 0; i < list.length; i++) {
            String value = String.valueOf(list[i]);
            value = String.valueOf(value.charAt(value.length()-1));
            result[Integer.parseInt(value)]++;
        }
        return result;
    }
}
