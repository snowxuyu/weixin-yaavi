import javax.swing.text.DateFormatter;
import java.text.SimpleDateFormat;
import java.util.function.BinaryOperator;
import java.util.function.Predicate;

/**
 * Created with IntelliJ IDEA.
 * User: snowxuyu
 * Date: 2016/11/25
 * Time: 2:34
 */
public class TestSha1 {
    public static void main(String[] args){
        Predicate<Integer> i = x -> x>1;
        System.out.println(i.test(3));

        BinaryOperator<Long> add = (x, y) -> x*y;
        System.out.println(add.apply(1L,2L));

        ThreadLocal.withInitial(()->new DateFormatter(new SimpleDateFormat("dd-MM-yyyy")));
    }
}
