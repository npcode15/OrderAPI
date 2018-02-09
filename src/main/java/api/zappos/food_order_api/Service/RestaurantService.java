package api.zappos.food_order_api.Service;

import api.zappos.food_order_api.Model.Restaurant;
import org.springframework.stereotype.Service;
import java.util.Hashtable;

@Service
public class RestaurantService {
    Hashtable<String, Restaurant> restaurantHash = new Hashtable<String, Restaurant>();

    public RestaurantService(){

        System.out.println("11111");
        Restaurant restaurant1 = new Restaurant();
        restaurant1.setId("1");
        restaurant1.setRestaurantName("Cafe Brasil");
        restaurant1.setRestaurantAddress("2604 Dunlavy St, Houston, TX 77005");
        restaurantHash.put("1", restaurant1);

        Restaurant restaurant2 = new Restaurant();
        restaurant2.setId("2");
        restaurant2.setRestaurantName("Axelrad Beer Garden");
        restaurant2.setRestaurantAddress("1517 Alabama St, Houston, TX 77004");
        restaurantHash.put("2", restaurant2);

        Restaurant restaurant3 = new Restaurant();
        restaurant3.setId("3");
        restaurant3.setRestaurantName("Conservatory");
        restaurant3.setRestaurantAddress("1010 Prairie St, Houston, TX 77002");
        restaurantHash.put("3", restaurant3);

        Restaurant restaurant4 = new Restaurant();
        restaurant4.setId("4");
        restaurant4.setRestaurantName("The Cheesecake Factory");
        restaurant4.setRestaurantAddress("5015 Westheimer Rd, Houston, TX 77056");
        restaurant4.setMenu(new MenuService().getMenuItemObj());
        restaurantHash.put("4", restaurant4);
    }

    public Restaurant getRestaurant(String id)
    {
        Restaurant restaurants = new Restaurant();
        restaurants.setRestaurantName("Invalid Restaurant");
        restaurants.setRestaurantAddress("N/A");

        if (restaurantHash.containsKey(id))
            return restaurantHash.get(id);
        else
            return restaurants;
    }

    public Hashtable<String, Restaurant> getAllRestaurant(){
        return restaurantHash;
    }
}