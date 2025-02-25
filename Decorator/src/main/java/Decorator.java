import BasePizza.*;
import Toppings.ExtraCheese;
import Toppings.Mushroom;

public class Decorator {
    public static void main(String[] args) {
        BasePizza basePizza = new VeggieParadise();

        System.out.println(basePizza.cost());
        basePizza = new Mushroom(basePizza);
        System.out.println(basePizza.cost());
        basePizza = new ExtraCheese(basePizza);
        System.out.println(basePizza.cost());
    }
}
