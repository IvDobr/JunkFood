import java.util.ArrayList;
import java.util.List;

/**
 *
 * Меню. Список блюд
 *
 */
public class Menu {
    private List<Meal> list = new ArrayList<Meal>();

    public Menu() {
    }

    public Menu(List<Meal> list) {
        this.list = list;
    }

    public Boolean menuCheck(Meal meal) {
        for(Meal m: list){
            if(m.equals(meal))
                return true;
        }
        return false;
    }

    public List<Meal> getList() {
        return list;
    }

    public void setList(List<Meal> list) {
        this.list = list;
    }
}