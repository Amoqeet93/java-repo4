import java.util.ArrayList;

public class Classroom {
    private String classroomName;
    ArrayList<Student> students = new ArrayList<>();

    public Classroom(String classroomName) {
        this.classroomName = classroomName;
    }

    public void addStudent(Student student){
        students.add(student);
    }

    public void showStudents(){
        for (Student s : students){
            s.displayInfo();
        }

    }
}
