public class Task2 {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();
        phonebook.add("Иванов", 1111);
        phonebook.add("Петров", 2222);
        phonebook.add("Сидоров", 3333);
        phonebook.add("Кузнецов", 4444);
        phonebook.add("Иванов", 5555);
        phonebook.add("Иванов", 5555);
        phonebook.get("Иванов");
        phonebook.get("Петров");
        phonebook.get("Обрезкин");
    }
}
