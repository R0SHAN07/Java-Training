import java.time.LocalDate;
import java.time.LocalDateTime;
public class time {
    public static void main(String[] args) throws InterruptedException {
        LocalDate myObj = LocalDate.now();
        LocalDate yes = myObj.plusDays(1);
        LocalDate tom = myObj.plusDays(2);
        LocalDateTime time = yes.atTime(10, 50, 10);
        System.out.println(myObj);
        System.out.println(yes);
        System.out.println(tom);
        System.out.println(time);
    }
}
