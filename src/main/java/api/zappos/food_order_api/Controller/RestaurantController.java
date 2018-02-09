package api.zappos.food_order_api.Controller;

import api.zappos.food_order_api.Model.Restaurant;
import api.zappos.food_order_api.Repository.RestaurantRepository;
import api.zappos.food_order_api.Service.RestaurantService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Hashtable;

@RestController
public class RestaurantController
{
    @Autowired
    RestaurantService restaurantService;

    @Autowired
    RestaurantRepository restaurantRepository;

//    @RequestMapping("/{id}")
//    public Restaurant getPerson(@PathVariable("id") String id){
//        return restaurantService.getRestaurant(id);
//    }

    //Create
    @RequestMapping(method= RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void create(@RequestBody Restaurant restaurant)
    {
        restaurantRepository.save(restaurant);
    }

    //read
    @RequestMapping(method=RequestMethod.GET, value="/restaurants/{id}")
    public Restaurant show(@PathVariable String id) {
        return restaurantRepository.findOne(id);
    }

    //Update
    @RequestMapping(method=RequestMethod.PUT, value="/restaurants/{id}", consumes = MediaType.APPLICATION_JSON_VALUE)
    public void update(Restaurant restaurant)
    {
        restaurantRepository.save(restaurant);
    }

    //Delete
    @RequestMapping(method=RequestMethod.DELETE, value="/restaurants/{id}")
    public String delete(@PathVariable String id)
    {
        restaurantRepository.delete(id);
        return "Restaurant Removed";
    }

//    @RequestMapping("/all")
//    public Hashtable<String, Restaurant> getAll(){
//        System.out.println("11111");
//        return restaurantService.getAllRestaurant();
//    }
}