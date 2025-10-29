package week8.pr1.collections.exercises.number;

import java.util.ArrayList;

public class RemoveEvenLength {

    public static void main(String[] args) {
        ArrayList<String> inputList = new ArrayList<>();
        inputList.add("odd");
        inputList.add("even");
        inputList.add("abc");
        inputList.add("abcd");
        inputList.add("abcde");
        removeEvenLength(inputList);
    }

    public static void removeEvenLength(ArrayList<String> arrList) {
        System.out.println("Input list: " + arrList);

        for (int i = 0; i < arrList.size(); i++) {
            if (i%2==0) arrList.remove(i);
        }

        System.out.println("Output list: " + arrList);
    }
}
