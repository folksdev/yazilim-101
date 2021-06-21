package workshop.oop;

public class Product {

    private int id;
    private String category;
    private double price;

    public Product(int id, String category, double price) {
        this.id = id;
        this.category = category;
        this.price = price;
    }

    public Product() {
    }
    /**getters and setters*/

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
