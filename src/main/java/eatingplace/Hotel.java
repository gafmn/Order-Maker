package eatingplace;

import meal.Meal;

public class Hotel implements Place {

    public void pack() {
        System.out.println("The com.order has been packed into beautiful box");
    }

    public void deliver() {
        System.out.println("The com.order has been delivered to the room");
    }

    public void cook(Meal meal) {
        System.out.println("The " + meal.getName() + " has been cooked");
    }
}
