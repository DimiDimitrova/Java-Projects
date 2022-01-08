import java.util.ArrayList;

public class Student {
    private String name;
    private String fNumber;
    ArrayList<Grade> grades;

    public Student() {
        grades = new ArrayList<>();
    }

    public String getfNumber() {
        return fNumber;
    }

    public void setfNumber(String fNumber) {
        this.fNumber = fNumber;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void addGrade(Grade grade)
    {
        grades.add(grade);
    }

    public Grade getGrade(int index)
    {
        return grades.get(index);
    }

    public int getGradesCount()
    {
        return grades.size();
    }
}
