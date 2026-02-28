package lambda.lambda5.filter;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class FilterMainV4 {

    public static void main(String[] args) {
        List<Integer> numbers = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        // 짝수만 거르기
        List<Integer> evenNumbers1 = IntegerFilter.fitler(numbers, n -> n % 2 == 0);

        // 홀수만 거르기
        List<Integer> oddNumbers1 = IntegerFilter.fitler(numbers, n -> n % 2 == 1);

        System.out.println("evenNumbers1 = " + evenNumbers1);
        System.out.println("oddNumbers1 = " + oddNumbers1);
    }
}