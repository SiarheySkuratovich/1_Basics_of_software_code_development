public class LineOfTwoDots {
    private Dot dot1;
    private Dot dot2;

    LineOfTwoDots(Dot dot1, Dot dot2) {
        this.dot1 = dot1;
        this.dot2 = dot2;
    }

    public boolean checkIfLiesOnTheLine(Dot verifiableDot) {
        int dX1X = Math.abs(verifiableDot.getX() - this.dot1.getX());
        int dY2Y1 = Math.abs(this.dot2.getY() - this.dot1.getY());
        int dX2X1 = Math.abs(this.dot2.getX() - this.dot1.getX());
        int dY1Y = Math.abs(verifiableDot.getY() - this.dot1.getY());
        int answer = (dX1X * dY2Y1) - (dX2X1 * dY1Y);
        return answer == 0;
    }
}
