import java.util.*;

public class Student implements Printable {
    private String name;
    private List<Integer> grade;

    public Student(String name, List<Integer> grade) {
        this.name = name;
        this.grade = grade;
    }

    @Override
    public void print() {
        System.out.println(name + grade);
    }
}
