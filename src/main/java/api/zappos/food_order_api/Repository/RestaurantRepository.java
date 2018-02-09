package api.zappos.food_order_api.Repository;

import api.zappos.food_order_api.Model.Restaurant;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface RestaurantRepository extends MongoRepository<Restaurant, String> {

    Restaurant findOneByRestaurantName(String name);

//    @Override
//    void delete(Restaurant deleted);
}
