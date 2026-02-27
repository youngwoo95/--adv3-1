package lambda.lambda1;

import lambda.Procedure;

public class ProcedureMain1 {

    public static void main(String[] args) {

        // 익명 클래스 사용
        Procedure procedure = new Procedure() {

            @Override
            public void run() {
                System.out.println("hello! lambda");
            }
        };

        procedure.run();

    }
}