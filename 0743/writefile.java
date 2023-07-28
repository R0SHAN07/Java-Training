import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class writefile {
    public static void main(String[] args) {
        try {
            File f = new File("write.txt");
            f.createNewFile();
            Scanner sc = new Scanner(f);
            while (sc.hasNextLine()) {
                System.out.println(sc);
            }
        } catch (IOException e) {
            System.out.println(e);
        }
    }
}
