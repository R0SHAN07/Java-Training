import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

public class queue {
    public static void main(String[] args) {
        Queue<Integer> arr = new PriorityQueue<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; ++i) {
            arr.add(sc.nextInt());
        }
        System.out.println(arr.peek());
    }
}
