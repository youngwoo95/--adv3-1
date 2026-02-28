package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class GenericFilter {

    /*
    * 제네릭 필터
    * */
    public static <T> List<T> fitler(List<T> list, Predicate<T> predicate) {

        List<T> filtered = new ArrayList<>();
        for (T num : list) {
            if(predicate.test(num)){
                filtered.add(num);
            }
        }
        return filtered;
    }
}