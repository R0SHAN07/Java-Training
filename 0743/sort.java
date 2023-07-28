//SORT element in a list

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class sort {
    public static void main(String[] args) {
        List<Integer> arr = new ArrayList<Integer>();
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the number of elements: ");
        int n = sc.nextInt();
        for (int i = 1; i <= n; ++i) {
            arr.add(sc.nextInt());
        }
        Collections.sort(arr);
        System.out.println(arr);
    }
}