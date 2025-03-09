public class Main {
    public static void main(String[] args) {

        Student student1 = new Student("Alice", 12);
        Student student2 = new Student("Moqeet", 11);
        Student student3 = new Student("Mariam", 10);

        Classroom classroom = new Classroom("Year 6");
        classroom.addStudent(student1);
        classroom.addStudent(student2);
        classroom.addStudent(student3);
        classroom.showStudents();
    }
}