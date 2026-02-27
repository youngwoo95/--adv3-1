package lambda.lambda1;

public class LambdaSimple4 {

    public static void main(String[] args) {
        MyCall call1 = (int value) -> value * 2; // 기본

        MyCall call2 = (value) -> value * 2; // 타입 추론

        MyCall call3 = value -> value * 2; // 괄호 생략 : 매개변수가 딱1개 일때 () 생략 가능.

        System.out.println("call1 = " + call1.call(3));
        System.out.println("call2.call(3) = " + call2.call(3));
        System.out.println("call3.call(3) = " + call3.call(3));
    }

    interface MyCall{
        int call(int value);
    }

}
