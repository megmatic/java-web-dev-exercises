package org.launchcode.java.studios.restaurantmenu;

import java.lang.reflect.Array;
import java.util.Date;
import java.util.ArrayList;
import java.util.HashMap;

public class Menu {

    private Date lastUpdated;
    private ArrayList<MenuItem> items;
    private HashMap<String, ArrayList<MenuItem>> categoryToItemsMap = new HashMap<>();

    public Menu(ArrayList<MenuItem> items) {
        setItems(items);
    }

    public Menu(Date d, ArrayList<MenuItem> items) {
        this.lastUpdated = d;
        setItems(items);
    }

    public void setItems(ArrayList<MenuItem> items) {
        this.items = items;
        this.lastUpdated = new Date();

        //convert them to the categoryToItemsMap
        for (MenuItem item: items) {
            String category = item.getCategory();
            if(categoryToItemsMap.containsKey(category)) {
                categoryToItemsMap.get(category).add(item);
            } else {
                ArrayList<MenuItem> newItems = new ArrayList<>();
                items.add(item);
                categoryToItemsMap.put(category,newItems);
            }

        }
    }

    public Date getLastUpdated() {
        return this.lastUpdated;
    }

    public String getMenuString() {
        String str = "";
        for (MenuItem item : this.items) {
            str += item.getCategory() + "(" + item.getPrice() + ")" + "-" + item.getDescription();

        }
        return str;
    }
}
