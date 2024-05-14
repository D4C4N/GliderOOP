package body;

import cockpit.Cockpit;
import cockpit.ControlStick;
import cockpit.Seat;
import wing.Wing;
import wing.WingPosition;

public class Body {
    private final Cockpit cockpit;
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

    public void aileronUp() {
        leftWing.aileronUp();
        rightWing.aileronUp();
    }

    public void aileronDown() {
        leftWing.aileronDown();
        rightWing.aileronDown();
    }
}
