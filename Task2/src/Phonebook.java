
import java.util.*;

public class Phonebook {
    private static HashMap<String, HashSet<String>> phonebook = new HashMap<>();

    public Phonebook() {
        phonebook = new HashMap<>();
    }

    //Добавляем записи в справочник
    public static void add(String surname, String numberPhone) {
        if (!phonebook.containsKey(surname)) {
            phonebook.put(surname, new HashSet<>());
        }
        phonebook.get(surname).add(numberPhone);

    }

    //Запрашиваем номера по фамилии
    public Set<String> get(String surname) {
        return phonebook.getOrDefault(surname, new HashSet<>());
    }
}


