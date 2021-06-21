package workshop.leetcode;

import java.util.List;

public class Order {
    private User user;
    private List<Product> productList;

    public Order(User user, List<Product> productList) {
        this.user = user;
        this.productList = productList;
    }

    public Order() {
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public List<Product> getProductList() {
        return productList;
    }

    public void setProductList(List<Product> productList) {
        this.productList = productList;
    }
}

class User {

}

class Product {

}
