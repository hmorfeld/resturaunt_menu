package menu;

import java.awt.*;
import java.util.ArrayList;
import java.util.Date;

public class Menu {

    private Date lastUpdated;
    private ArrayList<MenuItem> items;

    public Menu(Date lastUpdated, ArrayList<MenuItem> items) {
        this.lastUpdated = lastUpdated;
        this.items = items;
    }

    public Date getLastUpdated() {
        return lastUpdated;
    }

    public void setLastUpdated(Date lastUpdated) {
        this.lastUpdated = lastUpdated;
    }

    public ArrayList<MenuItem> getItems() {
        return items;
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
    }

    public ArrayList<MenuItem> addItem(MenuItem item) {
        this.items.add(item);
        return this.items;
    }

    public ArrayList<MenuItem> removeItem(MenuItem item) {
        int itemRemoved = -1;
        for (int i = 0; i < items.size(); i ++) {
            if (items.get(i).equals(item)) {
                itemRemoved = i;
            }
        }
        this.items.remove(itemRemoved);
        return this.items;
    }

    public String menuLastUpdated() {
        return ("The menu was last update on: " + this.lastUpdated);
    }

    public void printMenu(){
        for (int i = 0; i < items.size(); i++) {
            System.out.println(items.get(i).getDescription());

        }
    }

    public void printItem(MenuItem item) {
        System.out.println(item.getDescription());
    }

}
