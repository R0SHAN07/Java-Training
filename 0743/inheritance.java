 class A {
    public void display() {
        System.out.println("Hi from Roshan");
    }
}
class B extends A{
    public void disp() {
        System.out.println("DERIVED");
    }
}
public class inheritance{
    public static void main(String[] args) {
       B ob=new B();
        ob.display();
        ob.disp();
    }
} 

