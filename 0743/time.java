import java.util.Scanner;
public class time {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int hrs,min,newmin,newhr;
        System.out.println("Enter the minutes :");
        min=sc.nextInt();
        if(min>=60){
            newmin=min%60;
             newhr=min/60;
        }
        else{
             newmin=min;
             newhr=0;
        }
        System.out.println("Hours:"+newhr);
        System.out.println("Minutes:"+newmin);

    }
}
