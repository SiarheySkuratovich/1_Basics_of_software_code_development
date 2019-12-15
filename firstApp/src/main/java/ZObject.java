import java.util.Scanner;

public class ZObject {
    int a;
    int b;
    int c;

    ZObject(int _a, int _b, int _c) {
        a = _a;
        b = _b;
        c = _c;
    }

    double calc() {
        return ((a - 3) * b / 2) + c;
    }
}
