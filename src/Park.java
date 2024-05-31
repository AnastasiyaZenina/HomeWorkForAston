
public class Park {

    public class Attractions {
        private String nameOfTheAttraction;
        private String workingHours;
        private double price;

        public  Attractions(String nameOfTheAttraction, String workingHours, double price) {
            this.nameOfTheAttraction = nameOfTheAttraction;
            this.workingHours = workingHours;
            this.price = price;
        }

        public void attractionsInfo() {
            System.out.println("Аттракцион: " + nameOfTheAttraction);
            System.out.println("Часы работы: " + workingHours);
            System.out.println("Стоимость: " + price);

        }
    }
}
