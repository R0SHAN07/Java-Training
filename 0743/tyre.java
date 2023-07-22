import java.util.Scanner;

public class tyre {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the total number of vehicles to be manufactured :");
        int v=sc.nextInt();
        System.out.println("Enter the number of tyres available:");
        int w=sc.nextInt();
        float res=((4*v)-w)/2;
        if(w>=2 && (w%2==0) && v<w)              
             System.out.println("TW= "+(int)(res)+" FW= "+(int)(v-res));
             else                
             System.out.println("INVALID INPUT");

    }
}
