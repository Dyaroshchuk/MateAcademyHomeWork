package home.work10.robot;

public class Main {

    public static void main(String[] args) {
        Robot robot = new Robot();

        Robot.moveRobot(robot, 3, 2);

        System.out.println(robot.getPointX() + " " + robot.getPointY());

    }
}
