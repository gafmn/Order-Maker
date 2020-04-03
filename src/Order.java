import java.util.ArrayList;

public class Order {
    private ArrayList<Meal> mealList;
    private Place place;
    private double bill;

    public void processing() {
        for (Meal item : mealList)
            place.cook(item);
        place.pack();
        place.deliver();
    }
}
