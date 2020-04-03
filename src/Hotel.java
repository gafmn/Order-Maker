public class Hotel implements Place {

    public void pack() {
        System.out.println("The order have packed into beautiful box");
    }

    public void deliver() {
        System.out.println("The order have delivered to the room");
    }

    public void cook(Meal meal) {
        System.out.println("The " + meal.getName() + " have cooked");
    }
}
