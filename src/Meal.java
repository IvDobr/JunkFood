/**
 *
 * Еда. Пища.
 */
public class Meal {

    private Integer price;
    private String title;
    private Double weight;

    public  Meal (String title, Double weight, Integer price) {
        if (0 > price) throw new IllegalArgumentException("Price must not be negative");
        if (0 >= weight) throw new IllegalArgumentException("Weight must be more than zero");
        this.title = title;
        this.weight = weight;
        this.price = price;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Double getWeight() {
        return weight;
    }

    public void setWeight(Double weight) {
        this.weight = weight;
    }
}
