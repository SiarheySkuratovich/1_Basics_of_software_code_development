public class SubArea1 implements Area {
    private final int MIN_X;
    private final int MAX_X;
    private final int MIN_Y;
    private final int MAX_Y;

    public SubArea1() {
        MIN_X = -2;
        MAX_X = 2;
        MIN_Y = 0;
        MAX_Y = 4;
    }

    public boolean contains(Dot dot) {
        if (dot.getX() <= MAX_X && dot.getX() >= MIN_X) {
            if (dot.getY() <= MAX_Y && dot.getY() >= MIN_Y) {
                return true;
            }
        }
        return false;
    }

    public int getMAX_X() {
        return MAX_X;
    }

    public int getMAX_Y() {
        return MAX_Y;
    }

    public int getMIN_X() {
        return MIN_X;
    }

    public int getMIN_Y() {
        return MIN_Y;
    }
}
