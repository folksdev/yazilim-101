package workshop.oop;

import java.util.List;

public class User {

    private int id;
    private String name;
    private List<Order> orderList;

    public User(int id, String name, List<Order> orderList) {
        this.id = id;
        this.name = name;
        this.orderList = orderList;
    }

    public User() {
    }
    /**getters and setters**/
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Order> getOrderList() {
        return orderList;
    }

    public void setOrderList(List<Order> orderList) {
        this.orderList = orderList;
    }
}
