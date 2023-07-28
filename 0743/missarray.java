import java.util.Arrays;
import java.util.Scanner;
public class missarray {
    public static void main(String[] args) {
        {
            Scanner sc=new Scanner(System.in);

            int A=0,B=0,n;
            System.out.println("Enter number of elements:");
            n=sc.nextInt();
            int []arr=new int[n];
            for(int i=0;i<n;i++){
                System.out.println("Enter element:");
                arr[i]=sc.nextInt();
            }
            Arrays.sort(arr);

            for (int i = 0;i< arr.length;i++){
                for(int j=0;j<i;j++){
                    if(arr[i]==arr[j]){
                     A=arr[i];
                    }
                    if(arr[i]!=i+1){
                        B=i+1; 
                    }
                }
            } 
            System.out.println("A="+A);
            System.out.println("B="+B);
        }
    }
    
}
