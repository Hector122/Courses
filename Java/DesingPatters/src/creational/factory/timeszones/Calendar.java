package creational.factory.timeszones;

import creational.factory.timeszones.zones.Zone;
import creational.factory.timeszones.zones.ZoneType;

public abstract class Calendar {
    protected Zone zone = new Zone();

    public void print() {
        System.out.println(zone.getDisplayName() + " " + zone.getOffset());
    }

    protected abstract Zone createCalendar(ZoneType type);
}
