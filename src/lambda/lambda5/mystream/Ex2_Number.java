package lambda.lambda5.mystream;

import lambda.lambda3.GenericMain1;
import lambda.lambda5.filter.GenericFilter;
import lambda.lambda5.map.GenenricMapper;

import java.util.ArrayList;
import java.util.List;

public class Ex2_Number {

    public static void main(String[] args) {
        // 점수가 80점 이상인 학생의 이름을 추출해라.
        List<Student> students = List.of(
                new Student("Apple", 100),
                new Student("Banana", 80),
                new Student("Berry", 50),
                new Student("Tomato", 40)
        );

        List<String> directResult = direct(students);
        System.out.println("directResult = " + directResult);

        List<String> lambdaResult = lambda(students);
        System.out.println("lambdaResult = " + lambdaResult);
    }

    private static List<String> direct(List<Student> students) {
        List<String> result = new ArrayList<>();

        for (Student student : students){
            if(student.getScore() >= 80){
                result.add(student.getName());
            }
        }
        return result;
    }

    private static List<String> lambda(List<Student> students) {

        List<Student> scoreList = GenericFilter.fitler(students, n -> n.getScore() >= 80);
        List<String> mapper = GenenricMapper.map(scoreList, n -> n.getName());
        return mapper;
    }

}
