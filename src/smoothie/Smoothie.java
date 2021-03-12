package smoothie;

public class Smoothie {
    private double totalPrice;

    public void totalPrice(Ingredient one, Ingredient two, Ingredient three, Ingredient four){
        totalPrice = (one.getPrice() + two.getPrice() + three.getPrice() + four.getPrice())  * 1.3;
        System.out.println("Total price of smoothie is " + totalPrice);
    }

}