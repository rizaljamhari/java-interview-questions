# Robot Movements

We need a Robot class that can move around on a two dimensional plane. It needs to be able to change its position, report its position and report its last move as described below. Implement a Robot class per the following specifications:

##### Fields

| Data Type | Name      | Description                                                              |
|-----------|-----------|--------------------------------------------------------------------------|
| integer   | currentX  | The robot's current x-coordinate in the 2D plane                         |
| integer   | currentY  | The robot's current y-coordinate in the 2D plane                         |
| integer   | previousX | The robot's x-coordinate in the 2D plane prior its most recent movement. |
| integer   | previousY | The robot's y-coordinate in the 2D plane prior its most recent movement. |

Note: The robot's initial location is at (x, y) coordinate (0, 5).

##### Parameterized Constructor

| Data Type | Param Name | Description                             |
|-----------|------------|-----------------------------------------|
| integer   | x          | The value of currentX for the new Robot |
| integer   | y          | The value of currentY for the new Robot |

Note: The robot created by this constructor is considered to have spawned at (0, 5) and moved to (currentX, currentY) so (previousX, previousY) starts as (0, 5).

##### Methods

| Return Type | Mehod Name            | Param Type | Param Name | Description                                                                                                                                                                                                                                                                                                                                                                                                                    |
|-------------|-----------------------|------------|------------|--------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------|
| void        | moveX                 | integer    | dx         | Move the robot from current position (x, y) to new position (x + dx, y). Remember to maintain previousX                                                                                                                                                                                                                                                                                                                        |
| void        | moveY                 | integer    | dy         | Move the robot from current position (x, y) to new position (x, y + dy). Remember to maintain previousY                                                                                                                                                                                                                                                                                                                        |
| String      | getCurrentCoordinates | -          | -          | Return two space-separated integers describing the robot's current x and y coordinates as a string.                                                                                                                                                                                                                                                                                                                            |
| String      | getLastCoordinates    | -          | -          | Return two space-separated integers describing the robot's previousX and previousY coordinates as a string.                                                                                                                                                                                                                                                                                                                    |
| String      | getLastMove           | -          | -          | Return two space-separated values describing the robot's most recent movement as a string:  (1)  If the last move was moveX(dx), return x dx where x is the actual character x and dx is the distance moved in the x-direction during the last call to moveX.  (2)  If the last move was moveY(dy), return y dy where yis the actual character y and dyis the distance moved in the y-direction during the last call to moveY. |

#### Implement the Robot class according to the criteria above to pass all test cases.
1. The firstRobot object is initially at position (0, 5), so the call to firstRobot.getCurrentCoordinates() returns 0 5.
1. For the secondRobot object created with the parameterized constructor, it was created and moved from (0, 5) → (2, 1) so secondRobot.getCurrentCoordinates() returns 2 1. Next, we call the following sequence of methods on the secondRobot object:
   * secondRobot.moveX(1) moves the robot 1 unit from (2, 1) → (3, 1).
   * secondRobot.getLastMove() returns x 1 as its last movement was moveX(1).
   * secondRobot.getCurrentCoordinates() returns 3 1 because it moved from (2, 1) → (3, 1).
   * secondRobot.moveY(1) moves the robot 1 unit from (3, 1) → (3, 2).
   * secondRobot.getLastCoordinates() returns 3 1 because its last movement was (3, 1) → (3, 2), so the coordinates of its last location prior to the movement was (3, 1).
   * At this point, test code adds 1 to dx ⇒ dx = 2 and subtracts 1 from dy ⇒ dy = 0.
   * secondRobot.moveX(2) moves the robot from the (3, 2) → (5, 2).
   * secondRobot.getLastMove() returns x 2 as its last movement was moveX(2).
   * secondRobot.getCurrentCoordinates() returns 5 2 because it moved from (3, 2) → (5, 2).
   * secondRobot.moveY(0) moves the robot 0 units from (5, 2) → (5, 2).
   * secondRobot.getLastCoordinates() returns 5 2 because its last movement was (5, 2) → (5, 2).