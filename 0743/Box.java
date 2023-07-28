import javax.swing.Box;

public class Box<T> {
    private T t;

    public void add(T t) {
        this.t = t;
    }

    public T get() {
        return t;
    }

    public static void main(String[] args) {
        Box<Integer> integerBox = new Box<Integer>();
        Box<String> stringBox = new Box<String>();
        integerBox.add(new Integer(10));
        stringBox.add(new String( "Hello world"));
        System.out.println("Integer value : %d\n\n", integerBox.get());
        System.out.println("string value : %s\n\n", stringBox.get());

    }
}
