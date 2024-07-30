public class Main10 {
    public static void main(String[] args) {
        // Create the model
        Student student = new Student("1", "John Doe", "A");

        // Create the view
        StudentView view = new StudentView();

        // Create the controller
        StudentController controller = new StudentController(student, view);

        // Update the view
        controller.updateView();

        // Update the model data
        controller.setStudentName("Jane Doe");
        controller.setStudentGrade("B");

        // Update the view again
        controller.updateView();
    }
}
