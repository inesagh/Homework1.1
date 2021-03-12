package smoothie;

public class Main {
    public static void main(String[] args) {
        Smoothie smoothie = new Smoothie();
        Ingredient one = new Ingredient("strawberry", 300);
        Ingredient two = new Ingredient("banana", 100);
        Ingredient three = new Ingredient("mint", 50);
        Ingredient four = new Ingredient("milk", 200);
        smoothie.totalPrice(one, two, three, four);

    }
}
