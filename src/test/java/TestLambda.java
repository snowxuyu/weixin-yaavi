import java.util.function.BinaryOperator;

/**
 * Copyright @ 2016QIANLONG.
 * All right reserved.
 * Class Name : PACKAGE_NAME
 * Description :
 * Author : gaoguoxiang
 * Date : 2016/12/9
 */

public class TestLambda {
    public static void main(String[] args){
        //1
        BinaryOperator<Integer> addUp = (x, y) -> x + y;
        Integer apply = addUp.apply(1, 2);
        System.out.println(apply);

        //2

    }


}
