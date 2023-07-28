import java.util.HashSet;
import java.util.Scanner;

public class HASHSET {
    public static void main(String[] args) {
        HashSet<Integer> set = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter number of elements :");
        int n = sc.nextInt();
        for (int i = 0; i < n; i++) {
            set.add(sc.nextInt());
        }

        if (set.contains(10)) {
            System.out.println("Mil gaya ");
        } else {
            System.out.println("NAHI MILA");
        }
    }

}
