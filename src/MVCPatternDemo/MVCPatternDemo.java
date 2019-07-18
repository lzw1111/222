package MVCPatternDemo;

import Student.Student;
import StudentController.StudentController;
import StudentView.StudentView;

public class MVCPatternDemo {
	public static void main(String[] args) {
		Student model = retriveStudentFromDatabase();
		StudentView view = new StudentView();
		StudentController controller = new StudentController(model, view);
		controller.updateView();
		controller.setStudentName("ะกร๗");
		controller.updateView();
	}
	public static Student retriveStudentFromDatabase() {
		Student student = new Student();
		student.setName("Robert");
		student.setRollNo("10");
		return student;
	}
}
