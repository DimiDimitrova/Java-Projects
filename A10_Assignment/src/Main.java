import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
       /* Course 1: ?, Student 1: ?, Student 2: ?, Student 3: ?, Student 4: ?, Student 5: ?*/
        Scanner scanner = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();
        Course course1 = new Course();
        course1.setName(scanner.nextLine());
        for (int i =0; i<5;i++)
        {
            Student student = new Student();
            student.setName(scanner.nextLine());
            course1.addStudent(student);
        }
        courses.add(course1);
        Course course2 = new Course();
        course2.setName(scanner.nextLine());
        for (int i =0; i<3;i++)
        {
            Student student = new Student();
            student.setName(scanner.nextLine());
            course2.addStudent(student);
        }
        courses.add(course2);

        Course course3 = new Course();
        course1.setName(scanner.nextLine());
        for (int i =0; i<4;i++)
        {
            Student student = new Student();
            student.setName(scanner.nextLine());
            course3.addStudent(student);
        }
        courses.add(course3);
        System.out.println("");
        for (int i =0; i< courses.size();i++)
        {
            System.out.print("Course " + (i+1) + ": " + courses.get(i).getName());
            for (int j =0; j < courses.get(i).getStudentCount();j++)
            {
                System.out.print(", Student " + (j+1) +": "+ courses.get(i).getStudent(j).getName());
            }
            System.out.println("");
        }
    }
}
