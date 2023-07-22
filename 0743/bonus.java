import java.util.Scanner;
class salary extends bonus{
    void display(int salary){
        double bonus=(salary*0.25)+salary;
        System.out.println("Salary after Bonus: "+bonus);
    }
    
}
public class bonus {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter salary:");
        int salary=sc.nextInt();
        
        salary ob=new salary();
        ob.display(salary);
    }
    
}
