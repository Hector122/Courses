package creational.factory.timeszones.zones;

import java.rmi.MarshalledObject;

public class MountainZone extends Zone {

    public MountainZone(){
        setDisplayName("US/MOUNTAIN ZONE");
        setOffset(-5);
    }
}
