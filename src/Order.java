import java.util.ArrayList;

public class Order {
    private ArrayList<Meal> mealList;
    private Place place;

    Order(Place place, ArrayList<Meal> mealList) {
        this.place = place;
        this.mealList = mealList;
    }

    public void process() {
        for (Meal item : this.mealList)
            this.place.cook(item);
        this.place.pack();
        this.place.deliver();
    }
}
