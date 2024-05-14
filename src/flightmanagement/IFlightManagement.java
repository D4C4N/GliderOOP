package flightmanagement;

public interface IFlightManagement {
    void executeClimb();

    void executeSink();

    void executeTurnLeft();

    void executeTurnLeft(int degree);

    void executeTurnRight();

    void executeTurnRight(int degree);
}