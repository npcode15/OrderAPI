package api.zappos.food_order_api.Model;

import java.io.Serializable;
import java.util.ArrayList;

public class Restaurant implements Serializable {

    private String id;
    private String restaurantName;
    private String restaurantAddress;
    private Menu menu;

    public Restaurant() {
    }

    public Restaurant(String id, String restaurantName, String restaurantAddress) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
    }

    public Restaurant(String id, String restaurantName, String restaurantAddress, Menu menu) {
        this.id = id;
        this.restaurantName = restaurantName;
        this.restaurantAddress = restaurantAddress;
        this.menu = menu;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getRestaurantName() {
        return restaurantName;
    }

    public void setRestaurantName(String restaurantName) {
        this.restaurantName = restaurantName;
    }

    public String getRestaurantAddress() {
        return restaurantAddress;
    }

    public void setRestaurantAddress(String restaurantAddress) {
        this.restaurantAddress = restaurantAddress;
    }

    public Menu getMenu() {
        return menu;
    }

    public void setMenu(Menu menu) {
        this.menu = menu;
    }
}
