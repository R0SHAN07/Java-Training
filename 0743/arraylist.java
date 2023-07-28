import java.util.ArrayList;
import java.util.Collections;

public class arraylist {
    public static void main(String[] args) {
        ArrayList<Integer> TempArrayList = new ArrayList<Integer>();
        TempArrayList.add(30);
        TempArrayList.add(20);
        TempArrayList.add(10);
        TempArrayList.add(40);
        TempArrayList.add(50);
        Collections.sort(TempArrayList, Collections.reverseOrder());
        Collections.sort(TempArrayList, Collections.reverseOrder());
        System.out.println(TempArrayList);

    }
}
