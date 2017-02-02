
import java.io.PrintStream;
import java.io.UnsupportedEncodingException;

public class Test {
    public static void main(final String args[]) throws UnsupportedEncodingException {
        new PrintStream(System.out, true, "UTF-8").println("♟");
    }
}