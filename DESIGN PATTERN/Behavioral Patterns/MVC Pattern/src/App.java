public class App {
    public static void main(String[] args) throws Exception {
        Student model = retrieveStudentFromDatabase();

        StudentView view = new StudentView();
        StudentController controller = new StudentController(model, view);
        controller.updateView();
        controller.setStudentName("JOHN");
        controller.setStudentRollNo("1");
        controller.updateView();
    }

    private static Student retrieveStudentFromDatabase() {
        Student student = new Student();
        student.setName("Robert");
        student.setRollNo("10");
        return student;
    }
}
