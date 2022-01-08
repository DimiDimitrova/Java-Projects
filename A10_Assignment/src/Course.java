import java.util.ArrayList;

public class Course {
    private String name;
    private ArrayList<Student> students;

    public Course() {
        students = new ArrayList<>();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public Student getStudent(int index){
        return students.get(index);
    }
    public int getStudentCount(){
        return students.size();
    }


}
