public class Func {
    private double x;

    Func() {};

    Func (double x) {
        this.x = x;
    }

    public double calc() {
        if (x <= 3) {
            return x * x  - 3 * x + 9;
        } else {
            return 1 / (x * x * x  + 6);
        }
    }

    public void setX(double x) {
        this.x = x;
    }
}
