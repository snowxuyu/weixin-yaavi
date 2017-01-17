import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static java.lang.Character.isDigit;

/**
 * Copyright @ 2016QIANLONG.
 * All right reserved.
 * Class Name : PACKAGE_NAME
 * Description :
 * Author : gaoguoxiang
 * Date : 2016/12/8
 */

public class TestStream {

    private Logger logger = LoggerFactory.getLogger(this.getClass());

    public  void main(String[] args){

        //logger.debug(()->"log" + Exception.class);


        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add("yinyafei");
        arrayList.add("cailinfeng");
        arrayList.add("gaoguoxiang");
        arrayList.add("baowenqin");

        arrayList.stream().filter(s -> s.equals("yinyafei"));
        List<String> collect = Stream.of("a", "b", "c").collect(Collectors.toList());
        System.out.println(collect);

        List<String> stringList = Stream.of("a", "b", "c", "d").map(str -> str.toUpperCase()).collect(Collectors.toList());
        System.out.println(stringList);

        List<String> collect1 = Stream.of("1adv", "aa", "abcd1").filter(value -> isDigit(value.charAt(0))).collect(Collectors.toList());
        System.out.println(collect1);

        List<String> collect2 = Stream.of(Arrays.asList("1", "2", "3"), Arrays.asList("2", "3", "4", "5", "6")).flatMap(number -> number.stream()).collect(Collectors.toList());
        System.out.println(collect2);

        List<String> erwerewr = Arrays.asList(new String("123"), new String("534"), new String("11"));

        String s = erwerewr.stream().min(Comparator.comparing(track -> track.length())).get();
        System.out.println(s);

        BinaryOperator<Integer> accumulator = (acc, element) -> acc + element;
        Integer apply = accumulator.apply(accumulator.apply(accumulator.apply(0, 1), 2), 3);
        System.out.println(apply);

        //List<Object> albums = new ArrayList<Object>;
        //Set<String> trackNames = new HashSet<String>;
        //albums.stream().forEach(album ->{album.getTracks.forEach(track ->{track.getLength>60 {track.getName()}})});
    }
}
