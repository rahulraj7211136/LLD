package Toppings;

import BasePizza.BasePizza;

public class ExtraCheese implements Toppings{
    BasePizza basePizza;

    public ExtraCheese(BasePizza basePizza) {
        this.basePizza = basePizza;
    }

    public int cost() {
        return basePizza.cost() + 70;
    }
}
