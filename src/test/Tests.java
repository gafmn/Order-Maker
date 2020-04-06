import com.eatingplace.Hotel;
import com.eatingplace.Place;
import com.eatingplace.Restaurant;
import com.meal.Burger;
import com.meal.ColdDrink;
import com.meal.Meal;
import com.order.Order;
import org.junit.Test;
import java.util.ArrayList;


public class Tests {

    @Test
    public void test1(){
        Meal meal1 = new Burger("Big burger", 350);
        Meal meal2 = new ColdDrink("Dr Paper", 180);

        ArrayList<Meal> orderList = new ArrayList<>();
        orderList.add(meal1);
        orderList.add(meal2);

        Place place = new Hotel();

        Order order = new Order(place, orderList);
        order.process();
    }

    @Test
    public void test2(){
        Meal meal1 = new Burger("Vegan burger", 250);
        Meal meal2 = new ColdDrink("Lipton", 100);

        ArrayList<Meal> orderList = new ArrayList<>();
        orderList.add(meal1);
        orderList.add(meal2);

        Place place = new Restaurant();

        Order order = new Order(place, orderList);
        order.process();
    }



}