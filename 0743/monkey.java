import java.util.Scanner;
public class monkey {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n,m,p,k,j,ans=0;
        System.out.println("Total number of monkeys: ");
        n=sc.nextInt();
        System.out.println("Number of eatable bananas by a single monkey: ");
        k=sc.nextInt();
        System.out.println("Number of eatable peanuts by a single monkey: ");
        j=sc.nextInt();
        System.out.println("Total number of banana: ");
        m=sc.nextInt();
        System.out.println("Total number of peanuts: ");
        p=sc.nextInt();
        ans=ans+(m/k);
        ans=ans+(p/j);
        System.out.println(ans);



        
}
}