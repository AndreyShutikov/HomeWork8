package by.homework8;

public class Plate
{
    private int amountOfFood;

    Plate(int amountOfFood) {
        this.amountOfFood = amountOfFood;
    }


    void foodInPlate()
        {

            System.out.println( "Еды в тарелке: " + amountOfFood);
        }

    void decreaseFood(int appetite)
    {
        if (amountOfFood >= appetite)               amountOfFood -= appetite;
           }

    int getAmountOfFood() {
        return amountOfFood;
    }

    void addFood(int amount) {
        System.out.println("Добавление еды на " + amount);
        amountOfFood += amount;
    }
}
