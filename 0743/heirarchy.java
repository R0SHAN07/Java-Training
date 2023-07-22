class a{
    public void display(){
        System.out.println("hiii");
    }
}
class b extends a{
    public void disp(){
        System.out.println("How are you?");
    }
}
class c extends a{
    public void disp2(){
        System.out.println("Hello");
    }
}

public class heirarchy {
    public static void main(String[] args) {
        c ob=new c();
        b obj=new b();
        ob.disp2();
        
        obj.disp();
    

    }
    
}
