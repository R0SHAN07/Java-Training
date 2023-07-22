import java.util.Scanner;
public class evenarray {
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int arr[]=new int [10];
        for(int i=0;i<10;i++){
            System.out.println("Enter number "+i+":");
            arr[i]=sc.nextInt();
        }
        for(int j=0;j<10;j++){
           if(arr[j]%2==0){
            System.out.println(arr[j]);
           }
        }
    }
}
