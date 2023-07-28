import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class list {
    public static void main(String[] args) {
        List<String> l = new ArrayList<String>();
        l.add("one");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        l.add("Five");
        for(String s:l){
            System.out.println(s);
        }
        Iterator i=l.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
}
}