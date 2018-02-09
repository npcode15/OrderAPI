package api.zappos.food_order_api.Model;

public class Menu {

    private long id;
    private String menuType;
    private MenuItem menuItem;

    public Menu() {
    }

    public Menu(long id, String menuType, MenuItem menuItem) {
        this.id = id;
        this.menuType = menuType;
        this.menuItem = menuItem;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getMenuType() {
        return menuType;
    }

    public void setMenuType(String menuType) {
        this.menuType = menuType;
    }

    public MenuItem getMenuItem() {
        return menuItem;
    }

    public void setMenuItem(MenuItem menuItem) {
        this.menuItem = menuItem;
    }
}
