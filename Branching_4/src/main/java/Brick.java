public class Brick {
    private double[] abc;

    Brick() {
        abc = new double[3];
    }

    public boolean passes(Hole hole) {
        int flag = 0;
        for (double edge : abc) {
            if (edge < hole.getX() || edge < hole.getY()) {
                flag++;
            }
        }
        return flag >= 2;
    }

    public void setA(double a) {
        this.abc[0] = a;
    }

    public void setB(double b) {
        this.abc[1] = b;
    }

    public void setC(double c) {
        this.abc[2] = c;
    }
}
