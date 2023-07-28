import java.util.Hashtable;

public class HASHTABLE {
    public static void main(String[] args) {
        Hashtable<Integer, String> h = new Hashtable<Integer, String>();
        h.put(3, "APPLE");
        h.put(4, "MANGO");
        h.put(8, "ORANGE");
        h.put(5, "BANANA");
        System.out.println(h);
        System.out.println(h.get(3));
    }
}
