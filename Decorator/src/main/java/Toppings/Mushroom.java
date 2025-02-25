package Toppings;

import BasePizza.BasePizza;

public class Mushroom implements Toppings {
    BasePizza basePizza;

    public Mushroom(BasePizza basePizza1) {
        this.basePizza = basePizza1;
    }

    public int cost() {
        return basePizza.cost() + 50;
    }
}
