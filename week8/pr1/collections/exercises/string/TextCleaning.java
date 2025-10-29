package week8.pr1.collections.exercises.string;

public class TextCleaning {
    public static void main(String[] args) {
        String input = "Roses are red. Violets are blue, Sugar is sweet... And so are you.";
        System.out.printf("Original: %s\nCleaned: %s", input, cleanText(input));
    }

    public static String cleanText(String content) {
        content = content.toLowerCase();
        char[] charContent = content.toCharArray();
        StringBuilder result = new StringBuilder();

        for (int i = 0; i < content.length(); i++) {
            if (charContent[i] == 32) result.append(charContent[i]);
            if (charContent[i] >= 97 && charContent[i] <= 122) result.append(charContent[i]);
            if (charContent[i] >= 48 && charContent[i] <= 57) result.append(charContent[i]);
        }

        return result.toString();
    }
}
