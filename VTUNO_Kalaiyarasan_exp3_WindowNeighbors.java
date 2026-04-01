import java.util.*;

public class CBOW {

    public static void main(String[] args) {

        String corpus = "word embeddings are dense vector representations of words";
        String[] words = corpus.split(" ");

        int missingIndex = 1; // embeddings is missing

        System.out.println("Context words:");

        for (int i = 0; i < words.length; i++) {
            if (i != missingIndex) {
                System.out.print(words[i] + " ");
            }
        }

        System.out.println("\nPredicted word: " + words[missingIndex]);
    }
}
