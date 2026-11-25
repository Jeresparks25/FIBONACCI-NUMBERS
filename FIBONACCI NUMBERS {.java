import java.math.BigInteger;

public class Fibonacci {
    public static void main(String[] args) {
        BigInteger previous = BigInteger.ZERO;
        BigInteger current = BigInteger.ONE;

        for (int count = 0; count < 100; count++) {
            System.out.print(previous + " ");
            BigInteger next = previous.add(current);
            previous = current;
            current = next;
        }
    }
}
