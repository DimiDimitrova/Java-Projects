public class Course {
   /* Създайте клас bg.unwe.Course с атрибути name от тип String и students от тип масив от
    обекти на класа Student
    Създайте конструктора по подразбиране на класа и в него инициализирайте атрибута
    students с размер на масива от 5 елемента
    Създайте get и set методи за атрибута name*/
    private String name;
    private Student[] students;

    public Course() {
        students = new Student[5];
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    /*Създайте метод addStudent с аргументи student от тип Student (това е студентът, който да
добавим в масива от студенти) и index от тип int (това е индексът от масива от студенти,
                                                  където да запазим този студент)
    Създайте метод getStudent с аргумент index от тип int (този метод връща елемента от
            масива от студенти с този индекс)
    Създайте метод getStudentsCount, който да връща размера на масива от студенти*/
    public void addStudent(Student student,int index)
    {
        students[index] = student;
    }
    public Student getStudent(int index)
    {
        return students[index];
    }
    public int getStudentCount()
    {
        return students.length;
    }
}
