import java.util.Scanner;
public class friendship {
    public static void main(String[] args) {
        int count=0;
        double percentage;
        String bnew="";
        String anew="";
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter 1st name:");
        String a=sc.nextLine();
        int alen=a.length();
        System.out.println(alen);
        a.toLowerCase();
        System.out.println("Enter 2nd name:");
        String b=sc.nextLine();
        int blen=b.length();
        System.out.println(blen);
        b.toLowerCase();
        if(alen==blen){
            for(int i=0;i<alen;i++){
                if(b.charAt(i)==a.charAt(i)){
                    count++;
            }
        }
            percentage=(float) ((double)(count)/ alen * 100 );
            System.out.println("Friendship percentage:"+percentage); 
        }
        else{
           System.out.println("Ache se input daal lavde");
        }
    }
} 
