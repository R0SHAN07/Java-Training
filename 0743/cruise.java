import java.util.Scanner;
public class cruise {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter value for T:");
        int t =sc.nextInt();
        int en[]=new int[t];
        int ex[]=new int[t];
 int max=0;
 int onship=0;
        for(int i=0;i<t;i++){
            System.out.println("Hour"+(i+1)+"entry");
            en[i]=sc.nextInt();}
        for(int i=0;i<t;i++){
              System.out.println("Hour"+(i+1)+"exit");  
                ex[i]=sc.nextInt();
                
            }
        
            
        for(int i=0;i<t;i++){
            onship+=en[i]-ex[i];
            max=Math.max(max, onship);
        }
            
             
        
        System.out.println("Max members on cruise:"+max);
    }
    
}
