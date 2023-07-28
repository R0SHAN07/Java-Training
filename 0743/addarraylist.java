import java.util.ArrayList;

public class addarraylist {
    public static void main(String[] args) {
        ArrayList<String> arr = new ArrayList<String>();
        arr.add("one");
        arr.add("Two");
        arr.add("Three");
        arr.add("Four");
        arr.add("Five");
        if (arr.contains("Three")) {
            System.out.println("Yes, Three is present in the array list.");
        } else {
            System.out.println("Nope! Three not found!");
        }

    }

}
