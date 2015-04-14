import java.util.ArrayList;
import java.util.List;

/**
 *
 * КАССА. Принимает, хранит и обрабатывает заказы
 */
public class CashDesk {
    private List<Order> desk = new ArrayList<Order>();

    public void addOrder(Order order) {
        desk.add(order);
    }

    public Integer showCash() {
        Integer money = 0;
        for(Order o: desk) {
            money += o.getOverPrice();
        }
        return money;
    }

    public static void main(String[] args){
        //todo
    }
}
