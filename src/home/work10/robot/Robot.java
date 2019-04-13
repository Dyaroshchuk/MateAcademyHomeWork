package home.work10.robot;

public class Robot {
    private int pointX = 0;
    private int pointY = 0;
    private Direction direction = Direction.UP;

    public Direction getDirection() {
        return direction;
    }

    public int getPointX() {
        return pointX;
    }

    public int getPointY() {
        return pointY;
    }

    public void turnLeft() {
        switch (getDirection()) {
            default:
            case DOWN:
                direction = Direction.RIGHT;
                break;
            case UP:
                direction = Direction.LEFT;
                break;
            case RIGHT:
                direction = Direction.UP;
                break;
            case LEFT:
                direction = Direction.DOWN;
        }
    }

    public void turnRight() {
        switch (getDirection()) {
            default:
            case DOWN:
                direction = Direction.LEFT;
                break;
            case UP:
                direction = Direction.RIGHT;
                break;
            case RIGHT:
                direction = Direction.DOWN;
                break;
            case LEFT:
                direction = Direction.UP;
        }
    }


    public void stepForward() {
        switch (getDirection()) {
            default:
            case RIGHT:
                pointX++;
                break;
            case LEFT:
                pointX--;
                break;
            case UP:
                pointY++;
                break;
            case DOWN:
                pointY--;
                break;
        }
    }

    public static void moveRobot(Robot robot, int toX, int toY) {
        if (robot.getPointX() < toX) {
            while (robot.getDirection() != Direction.RIGHT) {
                robot.turnRight();
            }
            while (robot.getPointX() != toX) {
                robot.stepForward();
            }
        }
        if (robot.getPointX() > toX) {
            while (robot.getDirection() != Direction.LEFT) {
                robot.turnLeft();
            }
            while (robot.getPointX() != toX) {
                robot.stepForward();
            }
        }
        if (robot.getPointY() < toY) {
            while (robot.getDirection() != Direction.UP) {
                robot.turnRight();
            }
            while (robot.getPointY() != toY) {
                robot.stepForward();
            }
        }
        if (robot.getPointY() > toY) {
            while (robot.getDirection() != Direction.DOWN) {
                robot.turnLeft();
            }
            while (robot.getPointY() != toY) {
                robot.stepForward();
            }
        }
    }
}
