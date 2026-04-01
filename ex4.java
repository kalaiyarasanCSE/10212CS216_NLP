import java.util.*;

public class WindowNeighbors {

    public static void main(String[] args) {

        String sentence = "The Brown Fox jumps on Lazy Dog";
        String input = "Fox";
        int windowSize = 2;

        String[] words = sentence.split(" ");

        for (int i = 0; i < words.length; i++) {
            if (words[i].equalsIgnoreCase(input)) {

                System.out.println("Neighbours:");

                for (int j = Math.max(0, i - windowSize); 
                     j <= Math.min(words.length - 1, i + windowSize); j++) {

                    if (j != i) {
                        System.out.print(words[j] + " ");
                    }
                }
            }
        }
    }
}
