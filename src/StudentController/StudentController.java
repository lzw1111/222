package StudentController;

import Student.Student;
import StudentView.StudentView;

public class StudentController {
	private Student model;
	private StudentView view;
	public StudentController(Student model, StudentView view) {
		this.model = model;
		this.view = view;
	}
	public void setStudentName(String name) {
		this.model.setName(name);
	}
	public void setStudentRollNo(String RollNo) {
		this.model.setRollNo(RollNo);
	}
	public String getStudentName() {
		return this.model.getName();
	}
	public String getStudentRollNo() {
		return this.model.getRollNo();
	}
	public void updateView() {
		view.printStudentDetails(getStudentName(), getStudentRollNo());
	}
}
