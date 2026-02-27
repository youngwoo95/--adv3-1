package lambda.lambda3;

public class TargetType1 {

    public static void main(String[] args) {
        // 람다 직접 대입 : 문제 없음
        FunctionA functionA = i -> "value = " + i;
        System.out.println("functionA.apply(10) = " + functionA.apply(10));

        FunctionB functionB = i -> "value = " + i;
        System.out.println("functionB.apply(10) = " + functionB.apply(10));

        // 이미 만들어진 FunctionA 인스턴스를 FunctionB에 대입 : X
        //functionB = functionA; // java: incompatible types: lambda.lambda3.TargetType1.FunctionA cannot be converted to lambda.lambda3.TargetType1.FunctionB
        //System.out.println("functionB.apply(10) = " + functionB.apply(10));


    }

    @FunctionalInterface
    interface FunctionA {
        String apply(Integer i);
    }

    @FunctionalInterface
    interface FunctionB {
        String apply(Integer i);
    }

}
