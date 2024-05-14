import cockpit.Cockpit;
import cockpit.ControlStick;
import cockpit.Seat;

public class Body {
    private Cockpit cockpit;
    private Wing leftWing;
    private Wing rightWing;

    public Body() {
        cockpit = new Cockpit();
    }

    public Cockpit getCockpit() {
        return new Cockpit();
    }

    public void addControlStick(ControlStick controlStick) {
        cockpit.setControlStick(controlStick);
    }

    public void addSeat(Seat seat, int i) {
        cockpit.setSeat(seat, i);
    }

    public void addLeftWing(Wing wing) {
        leftWing = wing;
        leftWing.setPosition(WingPosition.LEFT);
    }

    public void addRightWing(Wing wing) {
        rightWing = wing;
        rightWing.setPosition(WingPosition.RIGHT);
    }
}
