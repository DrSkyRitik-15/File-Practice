import java.util.*;
 public class CapitalizeWords {
    public static void main(String[] args) {
        String input = "hello world, this is a test sentence.";

        String[] words = input.split("\\s+");
        StringBuilder result = new StringBuilder();

        for (String word : words) {
            String capitalizedWord = word.substring(0, 1).toUpperCase() + word.substring(1);
            result.append(capitalizedWord).append(" ");
        }

        System.out.println("Capitalized: " + result.toString().trim());
    }
}

