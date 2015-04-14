import java.util.ArrayList;
import java.util.List;

/**
 *
 * Меню. Список блюд
 *
 */
public class Menu {
    private static List<Meal> list = new ArrayList<Meal>();

    public static Boolean menuCheck(Meal meal) {
        for(Meal m: list){
            if(m.equals(meal))
                return true;
        }
        return false;
    }

    public static List<Meal> getList() {
        return list;
    }

    public static void setList(List<Meal> list) {
        Menu.list = list;
    }
}