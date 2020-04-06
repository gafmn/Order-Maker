package com.eatingplace;

import com.meal.Meal;

public interface Place {
    void pack();

    void deliver();

    void cook(Meal meal);
}