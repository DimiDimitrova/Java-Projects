import java.util.Scanner;

public class Main {
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        Course course = new Course();
        course.setName("Object-oriented programming");
        for (int i =0; i<5;i++)
        {
            Student student = new Student();
            student.setName(scanner.nextLine());
            student.setFacultyNumber(scanner.nextLine());
            course.addStudent(student,i);
        }
        System.out.println();
        System.out.println("Course: " + course.getName());
        for (int i =0;i<5;i++)
        {
            System.out.println("Student " + (i+1) + ": Name = " + course.getStudent(i).getName() + ", FN = " + course.getStudent(i).getFacultyNumber());
        }
    }
    /*Създайте клас bg.unwe.Main с public static void main метода в рамките на класа
    Създайте инстанция на класа Course и задайте името на курса да бъде „Object-oriented
    programming“
    Добавете 5 студента към този курс с подходящи имена и факултетни номера от
            клавиатурата
    Принтирайте на екрана следния резултат:
    Course: Object-oriented programming
    Student 1: Name = ?, FN = ?*/

}
