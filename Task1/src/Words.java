import java.util.*;

public class Words {

    // создаем список уникальных слов
    public static Set<String> findUniqueWords(String[] words) {
        return new HashSet<>(Arrays.asList(words));
    }

    //считаем количество повторений каждого слова
    public static Map<String, Integer> countWordOccurrences(String[] words) {
        Map<String, Integer> wordCount = new HashMap<>();
        for (String word : words) {
            wordCount.put(word, wordCount.getOrDefault(word, 0) + 1);
        }
        return wordCount;
    }
}




