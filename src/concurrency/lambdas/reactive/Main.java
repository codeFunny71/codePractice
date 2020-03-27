package concurrency.lambdas.reactive;


//import io.reactivex.Observable;

import java.util.Arrays;
import java.util.List;


public class Main {

    public static void main(String[] args) {

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,9,10);

        int result = 0;

        for (int e: numbers) {
            if(e % 2 == 0 ){
                result += e * 2;
            }
        }
        System.out.println(result);

        System.out.println(
            numbers.stream()
                .filter(e -> e % 2 == 0)
                .map(e -> e * 2)
                .reduce(0, Integer::sum));

        System.out.println(
                numbers.stream()
                        .filter(e -> e % 2 == 0)
                        .mapToInt(e -> e * 2)
                        .sum());

        //numbers.forEach(e -> System.out.println(e));
        numbers.forEach(System.out::println);

        numbers.stream()
                .map(e->String.valueOf(e))
                .map(String::toString)
                .forEach(System.out::println);

        System.out.println(
                numbers.stream()
                //.reduce(0, (total, e)->Integer.sum(total, e)));
                .reduce(0, (Integer::sum))
        );

        System.out.println(
            numbers.stream()
                    .map(String::valueOf)
                    //.reduce("", (carry, str)->carry.concat(str));
                    .reduce("", String::concat));
    }

//    public static void hello(String... names) {
////        Observable.fromArray(names).subscribe(s -> System.out.println("Hello " + s));
//    }
}
