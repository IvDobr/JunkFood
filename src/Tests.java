import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;
import java.util.List;

import static org.junit.Assert.assertNotNull;
import static org.junit.Assert.assertTrue;

/**
 *
 * ТЕСТЫ!!! TestDrivenDevelopment rules!!!
 */

public class Tests {
    @Before
    public void preparation(){
        List<Meal> menuList = new ArrayList<Meal>();
        for(int i = 1; i < 25; i++) {
            menuList.add(new Meal("Блюдо " + i, 101.1, 20));
        }
        Menu.setList(menuList);
    }

    @Test(expected= IllegalArgumentException.class)
    public void testNotInPrice(){
        new Order().addMeal(new Meal("Эдик", 75.5, 0));
    }

    @Test
    public void testInPrice(){
        new Order().addMeal((Menu.getList().get(7)));
    }

    @Test
    public void testMealGood() {
        Meal meal = new Meal("Эдик", 75.5, 0);
        assertNotNull(meal.getPrice());
        assertNotNull(meal.getWeight());
        assertNotNull(meal.getTitle());
        assertTrue("Check weight", meal.getWeight() > 0);
        assertTrue("Check Price", meal.getPrice() >= 0);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testMealFailedPrice() {
        Meal meal = new Meal("Эдик", 75.5, -344);
    }


    @Test(expected = IllegalArgumentException.class)
    public void testMealFailedWeight() {
        Meal meal = new Meal("Эдик", -75.5, 344);
    }

    @Test
    public void testMenu() {
        assertTrue("Is empty", !Menu.getList().isEmpty());
        assertTrue("Size is over 10 items", Menu.getList().size() >= 10);
    }

    @Test
    public void testOrder() {
        Order order = new Order();
        int checkPrice = 0;
        for (int i=1; i < 5; i++) {
            order.addMeal(Menu.getList().get(i), i);
            checkPrice += Menu.getList().get(i).getPrice() * i;
        }
        assertTrue("Check sum", checkPrice == order.getOverPrice());
    }

    @Test
    public void testCashDesk() {
        CashDesk cashDesk = new CashDesk();
        int checkCash = 0;

        for (int j=1; j < 10; j++) {
            Order order = new Order();
            for (int i = 1; i < 5; i++) {
                order.addMeal(Menu.getList().get(i), i);
                checkCash += Menu.getList().get(i).getPrice() * i;
            }
            cashDesk.addOrder(order);
        }

        assertTrue("Check cash", checkCash == cashDesk.showCash());
    }
}
