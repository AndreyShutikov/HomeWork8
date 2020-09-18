package by.homework8;

public class MainClass
{
    public static void main(String[] args) {
        Plate plate = new Plate(100);
        plate.foodInPlate();
        System.out.println("Список котов:");
        Cat[] x = {new Cat("Мурзик", 200), new Cat("Мурка", 15), new Cat("Машка", 20)};
        for (int i=0; i<x.length; i++) {
            System.out.println(x[i]);
        }
        plate.addFood(50);

        System.out.println("Коты поели:");
        for (int i=0; i<x.length; i++) {
            x[i].eat(plate);
            System.out.println(x[i]);
            plate.foodInPlate();
        }
    }
}
