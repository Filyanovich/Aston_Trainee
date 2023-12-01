package lesson8;

import java.util.*;

public class StringMethods {
    public static Set<String> uniqueWords(String[] arr) {
        List<String> wordsList = Arrays.asList(arr);
        Set<String> unique = new HashSet<>(wordsList);
        return unique;
    }

    public static Map<String, Integer> countDublicate(String[] arr) {
        List<String> wordsList = Arrays.asList(arr);
        Map<String, Integer> dublicate = new HashMap<>();
        for (String word : wordsList) {
            if (dublicate.containsKey(word)) {
                int count = dublicate.get(word);
                dublicate.put(word, count + 1);
            } else {
                dublicate.put(word, 1);
            }
        }
        return dublicate;

    }
}
