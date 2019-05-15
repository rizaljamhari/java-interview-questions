import org.junit.Test;
import static org.junit.Assert.assertEquals;

public class RobotTest {
    @Test
    public void testFirstRobotMovement() throws Exception {
        Robot firstRobot = new Robot();
        assertEquals("0 5", firstRobot.getCurrentCoordinates());
    }

    @Test
    public void testSecondRobotMovements() throws Exception {
        Robot secondRobot = new Robot(2,1);
        assertEquals("2 1", secondRobot.getCurrentCoordinates());

        secondRobot.moveX(1);
        assertEquals("x 1", secondRobot.getLastMove());
        assertEquals("3 1", secondRobot.getCurrentCoordinates());

        secondRobot.moveY(1);
        assertEquals("3 1", secondRobot.getLastCoordinates());

        secondRobot.moveX(2);
        assertEquals("x 2", secondRobot.getLastMove());
        assertEquals("5 2", secondRobot.getCurrentCoordinates());

        secondRobot.moveY(0);
        assertEquals("5 2", secondRobot.getLastCoordinates());
    }
}
