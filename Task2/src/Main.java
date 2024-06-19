//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Phonebook phonebook = new Phonebook();

        phonebook.add("Соловьев", "89002505505");
        phonebook.add("Соловьев", "89534006798");
        phonebook.add("Львова", "89181245675");
        phonebook.add("Львова", "89602346543");

        System.out.println("По фамилии Соловьев найдены номера:  " + phonebook.get("Соловьев"));
        System.out.println("По фамилии Львова найдены номера:  " + phonebook.get("Львова"));
    }
}
