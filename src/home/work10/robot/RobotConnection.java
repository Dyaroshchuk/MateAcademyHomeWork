package home.work10.robot;

public interface RobotConnection extends AutoCloseable {
    void moveRobotTo(int x, int y);

    @Override
    void close();
}
