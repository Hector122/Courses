package creational.factory.timeszones;

import creational.factory.timeszones.zones.*;

public class ZoneFactory {

    public Zone createZones(ZoneType type) {
        if (type == ZoneType.CENTRAL) {
            return new CenterZone();
        } else if (type == ZoneType.PACIFIC) {
            return new PacificZone();
        } else if (type == ZoneType.EASTERN) {
            return new EasternZone();
        } else if (type == ZoneType.MOUNTAIN) {
            return new MountainZone();
        } else return null;
    }
}
