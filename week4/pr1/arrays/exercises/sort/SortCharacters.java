package week4.pr1.arrays.exercises.sort;

import java.util.Scanner;

public class SortCharacters {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.println(sortCharacters(sc.next()));

    }

    public static String sortCharacters(String s) {
        StringBuilder result = new StringBuilder();
        int tempInt;
        int[] characterIntList = new int[s.length()];

        for (int i = 0; i < characterIntList.length; i++) {
            characterIntList[i] = s.charAt(i);
        }

        for (int i = 0; i < characterIntList.length - 1; i++) {
            for (int j = i + 1; j < characterIntList.length; j++) {
                if (characterIntList[i] > characterIntList[j]) {
                    tempInt = characterIntList[i];
                    characterIntList[i] = characterIntList[j];
                    characterIntList[j] = tempInt;
                }
            }
        }

        for (int i = 0; i < characterIntList.length; i++) {
            result.append((char) characterIntList[i]);
        }

        return result.toString();
    }
}
