import java.util.Arrays;
import java.util.List;
import java.util.Optional;

/**
 * Copyright @ 2016QIANLONG.
 * All right reserved.
 * Class Name : PACKAGE_NAME
 * Description :
 * Author : gaoguoxiang
 * Date : 2016/12/24
 */

public class TestStream2 {

    public static void main(String[] args){
        Optional<String> a = Optional.of("a");
        System.out.println("a".equals(a.get()));

        Optional<Object> empty = Optional.empty();
        Optional<Object> o = Optional.ofNullable(null);
        System.out.println(o.isPresent());

        System.out.println(a.isPresent());

        List<Integer> integers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8);

     }
}
