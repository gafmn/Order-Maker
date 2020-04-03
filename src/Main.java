import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Meal meal1 = new Burger("Big burger", 350);
        Meal meal2 = new ColdDrink("Dr Paper", 180);

        ArrayList<Meal> orderList = new ArrayList<>();
        orderList.add(meal1);
        orderList.add(meal2);

        Place place = new Hotel();

        Order order = new Order(place, orderList);
        order.process();
    }
}
