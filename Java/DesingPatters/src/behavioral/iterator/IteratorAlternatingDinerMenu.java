package behavioral.iterator;

import java.util.Calendar;

public class IteratorAlternatingDinerMenu implements Iterator {
    MenuItem [] items;
    int position;

    public IteratorAlternatingDinerMenu(MenuItem[] items){
        this.items = items;
        position = Calendar.DAY_OF_WEEK % 2;
    }

    @Override
    public boolean hasNext() {
        return !(position >= items.length);
    }

    @Override
    public MenuItem next() {
        MenuItem item = items[position];
        position += 2;
        return item;
    }
    public String toString() {
        return "Alternating Diner Menu Iterator";
    }
}
