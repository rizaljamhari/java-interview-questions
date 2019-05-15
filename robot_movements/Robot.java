public class Robot {

    private static int currentX;
    private static int currentY;
    private static int previousX;
    private static int previousY;
    private static String lastMove;
    private static int lastMoveCoordinate;

    Robot () {
       this.currentX = 0;
       this.currentY = 5;
    }

    Robot (int x, int y) {
        this.currentX = x;
        this.currentY = y;
    }

    public void moveX (int dx) {
        this.previousY = this.currentY;
        this.previousX = this.currentX;

        this.currentX =  this.currentX + dx;
        this.lastMove = "x";
        this.lastMoveCoordinate = dx;
    }

    public void moveY (int dy) {
        this.previousY = this.currentY;
        this.previousX = this.currentX;

        this.currentY = this.currentY + dy;
        this.lastMove = "y";
        this.lastMoveCoordinate = dy;
    }

    public String getCurrentCoordinates () {
        return this.currentX + " " + this.currentY;
    }

    public String getLastCoordinates () {
        return this.previousX + " " + this.previousY;
    }

    public String getLastMove () {
        return this.lastMove + " " + this.lastMoveCoordinate;
    }
}
