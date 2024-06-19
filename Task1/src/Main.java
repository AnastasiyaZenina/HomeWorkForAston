import java.util.Map;
import java.util.Set;

public class Main {
    public static void main(String[] args) {

        String[] words = {"Варшава", "Краков", "Ченстохова", "Белосток", "Торунь",
                "Познань", "Люблин", "Зелена-Гура", "Краков", "Торунь", "Вроцлав", "Люблин", "Жешув"};

        Set<String> uniqueWords = Words.findUniqueWords(words);
        System.out.println("Уникальные слова: " + uniqueWords);

        Map<String, Integer> wordOccurrences = Words.countWordOccurrences(words);
        System.out.println("Количество повторений каждого слова:");
        for (Map.Entry<String, Integer> entry : wordOccurrences.entrySet()) {
            System.out.println(entry.getKey() + ": " + entry.getValue());
        }
    }
}





