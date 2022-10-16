package creational.factory.timeszones;

import creational.factory.timeszones.zones.PacificZone;
import creational.factory.timeszones.zones.Zone;
import creational.factory.timeszones.zones.ZoneType;

public class MainDemoClient {
    public static void main(String[] args) {
        Calendar calendar = new PacificCalendar();
        calendar.print();
    }
}
