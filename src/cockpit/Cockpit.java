public class Cockpit {
    private ControlStick controlStick;
    private Seat[] seats;

    public Cockpit() {
        seats = new Seat[Configuration.INSTANCE.countSeats];
    }

    public ControlStick getControlStick() {
        return controlStick;
    }

    public void setSeat(Seat seat, int i) {
        seats[i] = seat;
    }

    public void setControlStick(ControlStick controlStick) {
        this.controlStick = controlStick;
    }
}
