public class Cat extends Animals {
    private static int catCount = 0;
    private final int MAX_RUN_DISTANCE = 200;
    boolean satiety = false;// все котики изначально голодны


    public Cat(String name) {
        super(name);
        catCount++; //счетчик  увеличивается при создании каждого котика
    }

    public void eat(Bowl bowl) {
        int portion = 10; // Количество еды, необходимое для сытости кота
        if (bowl.getFood() >= portion) {
            bowl.eatFromTheBowl(portion);
            satiety = true;
            System.out.println("Кот " + name + " покушал");
        } else {
            System.out.println("В миске недостаточно еды, кот " + name + " остался голодным.");
        }
    }


    public boolean isSatiety() {
        return satiety;
    }


    public String getName() {
        return name;
    }

    @Override
    public void run(int distance) {
        if (distance < 0) {
            System.out.println("Дистанция не может быть отрицательной!");
            return;
        }
        if (distance <= MAX_RUN_DISTANCE) {
            super.run(distance);
        } else {
            System.out.println(name + " не может пробежать больше " + MAX_RUN_DISTANCE + " м.");
        }
    }

    @Override
    public void swim(int distance) {
        System.out.println("Кот не умеет плавать!");
    }

    public static int getCatCount() {
        return catCount;
    }
}
