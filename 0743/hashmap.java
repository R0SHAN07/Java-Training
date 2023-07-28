import java.util.HashMap;
import java.util.Iterator;
import java.util.Scanner;

public class hashmap {
    public static void main(String[] args) {
        HashMap<Integer, String> h = new HashMap<Integer, String>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            h.put(sc.nextInt(), sc.nextLine());
        }
        System.out.println(h);
        Iterator<Integer> i = h.keySet().iterator();
        while (i.hasNext()) {
            int key = (int) i.next();
            System.out.println(h.get(key));
        }
    }

}
