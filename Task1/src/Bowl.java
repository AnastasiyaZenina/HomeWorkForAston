public class Bowl {
    private int food;

    public Bowl(int initialFoodInBowl) {
        this.food = initialFoodInBowl;
    }

    public boolean eatFromTheBowl(int amountOfFood) { //покушать  из миски
        if (amountOfFood <= food) {
            food -= amountOfFood;
            return true;
        } else {
            return false;
        }
    }


    public void addFoodInBowl(int amount) {  //добавляем еду в миску
        food += amount;
    }

    public int getFood() {
        return food;
    }
}


