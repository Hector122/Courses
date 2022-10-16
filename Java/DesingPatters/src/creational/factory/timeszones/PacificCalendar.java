package creational.factory.timeszones;

import creational.factory.timeszones.zones.Zone;
import creational.factory.timeszones.zones.ZoneType;

public class PacificCalendar extends Calendar {

    public PacificCalendar() {
        zone = createCalendar(ZoneType.PACIFIC);
    }

    @Override
    protected Zone createCalendar(ZoneType type) {
        ZoneFactory factory = new ZoneFactory();
        return factory.createZones(type);
    }
}
