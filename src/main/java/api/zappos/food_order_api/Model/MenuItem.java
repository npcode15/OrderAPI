package api.zappos.food_order_api.Model;

public class MenuItem {
    private long id;
    private String itemName;
    private String itemDescription;

    public MenuItem() {
    }

    public MenuItem(long id, String itemName) {
        this.id = id;
        this.itemName = itemName;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }
}