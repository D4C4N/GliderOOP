import cockpit.ControlStick;
import cockpit.Seat;

public class Glider {
    private Body body;

    public Glider() {
        body = new Body();
    }

    public Body getBody() {
        return new Body();
    }

    public void addControlStick(ControlStick controlStick) {
        body.addControlStick(controlStick);
    }

    public void addSeat(Seat seat, int i) {
        body.addSeat(seat, i);
    }

    public void addWings(Wing wing01, Wing wing02) {
        body.addLeftWing(wing01);
        body.addRightWing(wing02);
    }
}
