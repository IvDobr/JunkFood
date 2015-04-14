import java.util.HashMap;
import java.util.Map;

/**
 * Заказ
 */

public class Order {

    private Map<Meal, Integer> order = new HashMap<Meal, Integer>();

    public void addMeal(Meal meal){
        if (!Menu.menuCheck(meal)) throw new IllegalArgumentException("Meal not on the menu");
        order.put(meal, 1);
    }

    public void addMeal(Meal meal, int count) {
        if (!Menu.menuCheck(meal)) throw new IllegalArgumentException("Meal not on the menu");
        order.put(meal, count);
    }

    public Map<Meal, Integer> getOrder() {
        return order;
    }

    public int getOverPrice() {
        int price = 0;
        for (Meal m: order.keySet()) {
            price += m.getPrice() * order.get(m);
        }
        return price;
    }
}
