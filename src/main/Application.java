import cockpit.ControlStick;
import cockpit.Seat;

public class Application {
    public static void buildSeats(Glider glider) {
        for (int i = 0; i < Configuration.INSTANCE.countSeats; i++) {
            glider.addSeat(new Seat(), i);
        }
    }

    public static void main(String[] args) {
        System.out.println("Welcome | Glider");

        Glider glider = new Glider();
        ControlStick controlStick = new ControlStick();

        glider.addControlStick(controlStick);
        glider.addWings(new Wing(), new Wing());

        buildSeats(glider);
    }
}
