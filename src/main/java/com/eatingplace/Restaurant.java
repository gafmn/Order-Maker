package com.eatingplace;
import com.meal.Meal;

public class Restaurant implements Place {

    public void pack() {
        System.out.println("The com.order has been packed into huge tray");
    }

    public void deliver() {
        System.out.println("The com.order has been delivered to the table");
    }

    public void cook(Meal meal) {
        System.out.println("The " + meal.getName() + " has been cooked");
    }
}
