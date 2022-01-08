import java.util.ArrayList;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        ArrayList<Student> students = new ArrayList<>();

        for (int i = 0; i < 5; i++)
        {
            Student student = new Student();
            student.setName(scanner.nextLine());
            student.setfNumber(scanner.nextLine());
            for (int j =0; j<2;j++)
            {
                Course course = new Course();
                course.setName(scanner.nextLine());

                Grade grade = new Grade();
                String gg = scanner.nextLine();
                double dnum = Double.parseDouble(gg);
                grade.setValue(dnum);
                grade.setCourse(course);


                student.addGrade(grade);

            }
            students.add(student);

        }
        for (int i =0; i< students.size();i++) {
            System.out.print("Student " + (i+1) + ": Name = " + students.get(i).getName() + ",FN = " + students.get(i).getfNumber());
            for (int j=0; j< students.get(i).getGradesCount();j++)
            {
                System.out.print(", Grade " + (j+1) + ": " + students.get(i).getGrade(j).getValue()+ "[Course = " + students.get(i).getGrade(j).getCourse().getName()
                        + ", Value = " + students.get(i).getGrade(j).getValue() + "],");
            }
            System.out.println("");
        }







    }




}