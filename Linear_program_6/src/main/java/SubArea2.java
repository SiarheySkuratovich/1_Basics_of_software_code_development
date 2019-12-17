public class SubArea2 {
    private final int MIN_X;
    private final int MAX_X;
    private final int MIN_Y;
    private final int MAX_Y;

    public SubArea2() {
        MIN_X = -4;
        MAX_X = 4;
        MIN_Y = -3;
        MAX_Y = 0;
    }

    public boolean contains(Dot dot) {
        if (dot.getX() <= MAX_X && dot.getX() >= MIN_X) {
            if (dot.getY() <= MAX_Y && dot.getY() >= MIN_Y) {
                return true;
            }
        }
        return false;
    }

    public int getMIN_Y() {
        return MIN_Y;
    }

    public int getMIN_X() {
        return MIN_X;
    }

    public int getMAX_Y() {
        return MAX_Y;
    }

    public int getMAX_X() {
        return MAX_X;
    }
}
