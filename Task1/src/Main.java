//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Dog dogRex = new Dog("Рекс");
        dogRex.run(502);
        dogRex.swim(9);


        Cat catMurzik = new Cat("Кузя");
        catMurzik.run(104);
        catMurzik.swim(1);


        System.out.println("Всего животных: " + Animals.getAnimalsCount());
        System.out.println("Всего собак: " + Dog.getDogCount());
        System.out.println("Всего котов: " + Cat.getCatCount());


        Cat[] cats = {  //создаем массив котов
                new Cat("Тимошка"),
                new Cat("Мурзик"),
                new Cat("Василий")
        };

        Bowl bowl = new Bowl(25); // В миске изначально 25 единиц еды
        for (Cat cat : cats) {
            cat.eat(bowl); // Каждый кот пытается покушать
        }

        for (Cat cat : cats) {
            System.out.println("Кот " + cat.name + " сыт: " + cat.isSatiety());
        }


        bowl.addFoodInBowl(20); // Добавляем в миску 20 еды
        System.out.println("В миске теперь: " + bowl.getFood() + " единиц еды");

    }
}