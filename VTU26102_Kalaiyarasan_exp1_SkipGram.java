import java.util.*;

public class SkipGram {

    public static void main(String[] args) {
        String corpus = "word embedding are awesome";
        String input = "embedding";

        String[] words = corpus.split(" ");
        int windowSize = 1;

        for (int i = 0; i < words.length; i++) {
            if (words[i].equals(input)) {

                System.out.println("Context words:");

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
