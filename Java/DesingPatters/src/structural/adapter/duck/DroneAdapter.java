package structural.adapter.duck;

public class DroneAdapter implements Duck {
    private Drone drone;

    public DroneAdapter(Drone drone) {
        this.drone = drone;
    }

    @Override
    public void fly() {
        drone.spin_rotors();
        drone.take_off();
    }

    @Override
    public void quack() {
        drone.beep();
    }
}
