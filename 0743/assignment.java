import java.util.ArrayList;
import java.util.Hashtable;
import java.util.Map;

public class assignment {
    public static void main(String[] args) {
        Hashtable<Integer, ArrayList<String>> Hmap = new Hashtable<Integer, ArrayList<String>>();

        Hmap.put(4, new ArrayList<String>());
        Hmap.put(5, new ArrayList<String>());

        Hmap.get(4).add("Apple");
        Hmap.get(4).add("RED");
        Hmap.get(4).add("140");

        Hmap.get(5).add("Mango");
        Hmap.get(5).add("Yellow");
        Hmap.get(5).add("200");

        for (Map.Entry<Integer, ArrayList<String>> entry : Hmap.entrySet()) {
            Integer key = entry.getKey();
            ArrayList<String> values = entry.getValue();
            System.out.println(key + "=" + values);
        }
    }
}