class cons{
    String s;
    cons(String p){
        s=p;
        System.out.println(s);
    }
    cons(cons ob){
        s=ob.s;
        System.out.println("Hello "+s);
    }
}
public class copy {
    public static void main(String[] args) {
        cons c1=new cons("How are you?");
        cons c2=new cons(c1);
    }
}
