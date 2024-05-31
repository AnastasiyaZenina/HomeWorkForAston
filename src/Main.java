//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Employee employee1 = new Employee("Дэниэл Киз", "писатель", "daniel.kiz@mail.ru", "79531002346", 64000, 34);
        employee1.employeeInfo();

        Park.Attractions attractions1 = new Park().new Attractions("Паровозик", "10-17:30", 140.50);
        attractions1.attractionsInfo();
    }
}