

public class Employee {
    private String fullName;
    private String positionAtWork;
    private String email;
    private String phone;
    private int salary;
    private int age;

    public Employee(String name, String position, String email, String phone, int salary, int age) {
        this.fullName = name;
        this.positionAtWork = position;
        this.email = email;
        this.phone = phone;
        this.salary = salary;
        this.age = age;
    }

    public void employeeInfo() {
        System.out.println("ФИО:" + fullName);
        System.out.println("Должность:" + positionAtWork);
        System.out.println("email:" + email);
        System.out.println("Телефон:" + phone);
        System.out.println("Зарплата:" + salary);
        System.out.println("Возраст:" + age);

    }

    public static void arrayOfEmployees(String[] args) {
        Employee[] empArray = new Employee[5];
        empArray[0] = new Employee("Remus Lupine", "Professor", "werewolf@mail.com", "89003030003", 40000, 38);
        empArray[1] = new Employee("Minerva McGonagall", "Professor", "whiskas.the.best@mail.com", "89237773456", 68000, 74);
        empArray[2] = new Employee("Rubeus Hagrid", "Forester", "rubeusAndFang@mail.com", "89189060505", 45000, 52);
        empArray[3] = new Employee("Albus Dumbledore", "Director", "lemonSherbet@mail.com", "84502345767", 90000, 150);
        empArray[4] = new Employee("Severus Snape", "Professor", "nuneus@mail.com", "88002505505", 68000, 40);

        System.out.println(empArray);

    }


}