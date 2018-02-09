package api.zappos.food_order_api.Service;

import api.zappos.food_order_api.Model.Menu;
import api.zappos.food_order_api.Model.MenuItem;

public class MenuService {

    private Menu menuObj;

    public Menu getMenuItemObj()
    {
        return menuObj;
    }

    public MenuService(){
        Menu menu = new Menu();
        MenuItem menuItem = new MenuItem();

        menu.setId(1);
        menu.setMenuType("Dessert");

        menuItem.setId(1);
            menuItem.setItemName("Original Cheesecake");
        menuItem.setId(2);
        menuItem.setItemName("Fresh Strawberry Cheesecake");
        menuItem.setId(3);
        menuItem.setItemName("Hot Fudge Sundae");
        menuItem.setId(4);
        menuItem.setItemName("Warm Apple Crisp");

        menu.setMenuItem(menuItem);
        menuObj = menu;
    }
}
