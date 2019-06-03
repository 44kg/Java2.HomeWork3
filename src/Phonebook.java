import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class Phonebook {
    Map<String, HashSet> phonebook;

    public Phonebook() {
        phonebook = new HashMap<>();
    }

    public void add(String name, int phoneNumber) {
        if (phonebook.containsKey(name)) {
            phonebook.get(name).add(phoneNumber);
        }
        else {
            HashSet<Integer> phoneNumbers = new HashSet<>();
            phoneNumbers.add(phoneNumber);
            phonebook.put(name, phoneNumbers);
        }
    }

    public void get(String name) {
        if ((phonebook.containsKey(name))) {
            System.out.println("Номера телефонов по фамилии " + name + " " + phonebook.get(name));
        }
        else {
            System.out.println("Фамилии " + name + " нет в справочнике");
        }
    }
}
