package behavioral.iterator;

import java.util.ArrayList;

public class IteratorPancakeHouseMenu implements Iterator {
    ArrayList<MenuItem> items;
    int position = 0;

    public IteratorPancakeHouseMenu(ArrayList<MenuItem> items){
        this.items = items;
    }

    @Override
    public boolean hasNext() {
        return !(position >= items.size());
    }

    @Override
    public MenuItem next() {
        MenuItem item = items.get(position);
        position += 1;

        return item;
    }
}
