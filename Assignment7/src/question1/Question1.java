package question1;

import java.io.*;
import java.util.*;


public class Question1 {

    public static void main(String[] args) {
        if (args.length != 1) {
            System.out.println("Usage: java WordCounterFromFile <file-path>");
            return;
        }

        String filePath = args[0];
        Map<String, Integer> wordCount = new HashMap<>();

        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line;
            while ((line = reader.readLine()) != null) {
                countWords(line, wordCount);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Word occurrences:");
        for (Map.Entry<String, Integer> entry : wordCount.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }

    private static void countWords(String text, Map<String, Integer> wordCount) {
        String[] words = text.split("\\s+");

        for (String word : words) {
            word = word.toLowerCase().replaceAll("[^a-zA-Z]", ""); // Remove punctuation and convert to lowercase
            if (word.isEmpty()) {
                continue;
            }
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
    }
}