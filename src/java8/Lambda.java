package java8;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Created by DELL on 2017/6/14.
 */
public class Lambda {
    public static void main(String[] args) {
//        new Thread(() -> System.out.println("hahaha")).start();
        String[] datas = new String[]{"abcd", "heihei", "hahaha"};
        Arrays.sort(datas);
        Stream.of(datas).forEach(s -> System.out.println(s + ""));
        List<String> list = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list.add(i + "");
        }
        list.forEach(o -> {
            System.out.println(o + "");
        });
        String[] datas2 = new String[]{"peng", "zhao", "li"};
        Comparator<String> comp = (v1, v2) -> Integer.compare(v1.length(), v2.length());
        Arrays.sort(datas2, (o1, o2) -> {
            if (o1.length() > o2.length()) return 0;
            return 1;
        });

        Stream.of(datas).forEach(System.out::println);
        Arrays.sort(datas, String::compareToIgnoreCase);
        List<Integer> list1 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list1.add(i);
        }
        list1.stream().filter(num -> num != 1).count();
        list1.stream().map(integer -> integer + "");
        list1.stream().flatMap((Function<Integer, Stream<?>>) Stream::of);
        Stream<List<Integer>> inputStream = Stream.of(Collections.singletonList(1)
                , Arrays.asList(2, 3),
                Arrays.asList(4, 5, 6)
        );
        Stream<Integer> outputStream = inputStream.flatMap(Collection::stream);
        outputStream.forEach(System.out::print);
        list1.stream().peek(integer -> System.out.println(integer + "has Been Used")).forEach(System.out::println);
        Stream.generate((Supplier<Object>) Math::random);
        List<String> list3 = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            list3.add("TGS" + i);
        }
        List<String> newStrings = list3.stream().filter(s -> !s.equals("TGS1"))
                .collect(LinkedList::new,
                        LinkedList::add,
                        LinkedList::addAll);

        List<String> list2 = list3.stream().filter(s -> !s.equals("TGS1")).collect(Collectors.toList());
        List<Integer> numsWithoutNull = list1.stream().filter(num -> num != null).
                collect(ArrayList::new,
                        ArrayList::add,
                        ArrayList::addAll);
//        list3.stream().reduce()
    }
}
