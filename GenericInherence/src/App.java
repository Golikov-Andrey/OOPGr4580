import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) throws Exception {
        //System.out.println("Hello, World!");
        Student<String,Integer> s1 = new Student<String,Integer>("Сергей", 34 , 101);
        System.out.println(s1);
        Student<String,Integer> s2 = new Student<String,Integer>("Иван", 24 , 102);
        Student<String,Integer> s3 = new Student<String,Integer>("Андрей", 27 , 103);

        List<Student<String,Integer>> listStud = new ArrayList<>();
        listStud.add(s1);
        listStud.add(s2);
        listStud.add(s3);

        StudentGroup<String,Integer> group = new StudentGroup<String,Integer>(listStud, "4580");
        for(Student<String,Integer> stud :group)
        {
            System.out.println(stud);
        }
    }
}
