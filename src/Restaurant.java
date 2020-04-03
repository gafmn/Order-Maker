public class Restaurant implements Place {

    public void pack() {
        System.out.println("The order have packed into huge tray");
    }

    public void deliver() {
        System.out.println("The order have delivered to the table");
    }

    public void cook(Meal meal) {
        System.out.println("The " + meal.getName() + " have cooked");
    }
}
