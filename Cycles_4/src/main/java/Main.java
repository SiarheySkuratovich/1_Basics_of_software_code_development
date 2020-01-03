import java.math.BigInteger;

public class Main {
    public static void main(String[] args) {
        BigInteger comp = BigInteger.ONE;
        BigInteger TWO_HUNDRED = BigInteger.valueOf(200);
        BigInteger i = BigInteger.ONE;
        while (i.compareTo(TWO_HUNDRED) != 0) {
            comp = comp.multiply(i.multiply(i));
            i = i.add(BigInteger.ONE);
        }
        System.out.println("composition of squares of fist 200 numbers except 0 is " + comp);
    }
}
