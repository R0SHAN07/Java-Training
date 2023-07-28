
    interface A{
        void disp();
    }
    interface B{
        void disp1();
    }
    class Main implements A,B{
        public void disp(){ System.out.println("I from interface A");
        }
        public void disp1(){
            System.out.println("From interface B");
        }}

 public class multipleinheritance {
    public static void main(String[] args) {
        
    }
}

