//java program to demonstarte SET CONCEPT

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class set {
    public static void main(String[] args) {
        Set<String> l = new HashSet<String>();
        l.add("one");
        l.add("Two");
        l.add("Three");
        l.add("Four");
        l.add("Five");
        System.out.println(l);
        for (String s : l) {
            System.out.println(s);
        }
        Iterator i = l.iterator();
        while (i.hasNext()) {
            System.out.println(i.next());
        }
    }
}
