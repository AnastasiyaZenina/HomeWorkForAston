public interface Figure {
    String getFillColor();
    String getBorderColor();

    default double calculatePerimeter() {
        return 0.0;
    }

    default double calculateArea() {
        return 0.0;
    }

    default void printCharacteristics() {
        System.out.println(
                "Периметр:" + calculatePerimeter() +
                        ", Площадь: " + calculateArea() +
                        ", Цвет заливки: " + getFillColor() +
                        ", Цвет границы: " + getBorderColor());
    }
}
