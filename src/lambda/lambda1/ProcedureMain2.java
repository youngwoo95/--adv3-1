package lambda.lambda1;

import lambda.Procedure;

public class ProcedureMain2 {

    public static void main(String[] args) {

        // 익명 클래스 사용
        Procedure procedure = () -> {
                System.out.println("hello! lambda");
        };

        procedure.run();

    }
}
