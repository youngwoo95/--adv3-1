package lambda.lambda3;

public class GenericMain6 {

    public static void main(String[] args) {
        GenericFunction<String, String> toUpperCase = s -> s.toUpperCase();
        GenericFunction<String, Integer> stringLength = s -> s.length();
        GenericFunction<Integer, Integer> square = n -> n * n;
        GenericFunction<Integer, Boolean> isEven = n -> n % 2 == 0;

        String result1 = toUpperCase.apply("hello");
        Integer result2 = stringLength.apply("hello");
        Integer result3 = square.apply(3);
        Boolean result4 = isEven.apply(3);

        System.out.println("result1 = " + result1);
        System.out.println("result2 = " + result2);
        System.out.println("result3 = " + result3);
        System.out.println("result4 = " + result4);
    }

    @FunctionalInterface
    interface GenericFunction<T, R>{
        R apply(T s);
    }
}