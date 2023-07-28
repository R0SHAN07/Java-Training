import java.io.IOException;

public class exception1 {

    public static void main(String[] args) throws IOException {
        int a = 10;
        try {
            System.out.println(a / 0);
        } catch (ArithmeticException e) {
            System.out.println("Error: " + e);

        } finally {
            System.out.println("this is arithmatic exception error");
        }
    }

}
