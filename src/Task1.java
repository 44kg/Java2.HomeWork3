import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Task1 {

    public static void main(String[] args) {
        List<String> words = new ArrayList<>();
        words.add("Google");
        words.add("Facebook");
        words.add("Apple");
        words.add("Twitter");
        words.add("Yahoo");
        words.add("Google");
        words.add("Facebook");
        words.add("Sony");
        words.add("Samsung");
        words.add("Geekbrains");
        words.add("Google");

        Map<String, Integer> wordsMap = new HashMap<>();
        for (String word : words) {
            if (wordsMap.containsKey(word)) {
                wordsMap.put(word, wordsMap.get(word) + 1);
            } else {
                wordsMap.put(word, 1);
            }
        }
        System.out.println("Счётчик слов: " + wordsMap);
        System.out.print("Список уникальных слов: ");
        for (Map.Entry<String, Integer> entry : wordsMap.entrySet()) {
            if (entry.getValue() == 1) {
                System.out.print(entry.getKey() + " ");
            }
        }

    }
}