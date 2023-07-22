import java.util.*;
public class sum {
    public static void main(String [] args){
        int sum=0,rem,n;
        Scanner sc = new Scanner(System.in);
        n=sc.nextInt();
        while(n>0){
            rem=n%10;
            sum=sum+rem;
            n=n/10;
        }
        System.out.print(sum);
        
        
    }
}
