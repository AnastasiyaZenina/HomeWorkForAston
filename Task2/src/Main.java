//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0, "Синий", "Черный");
        System.out.println("Круг");
        circle.printCharacteristics();

        Rectangle rectangle = new Rectangle(4.0, 6.0, "Зеленый", "Серый");
        System.out.println("Прямоугольник");
        rectangle.printCharacteristics();


        Triangle triangle = new Triangle(3.0, 4.0, 5.0, "Желтый", "Фиолетовый");
        System.out.println("Треугольник");
        triangle.printCharacteristics();
    }
}