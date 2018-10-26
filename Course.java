
public class Course {
	private String courseName;
	private String[] students = new String[5];
	private int numberOfStudents;
	
	public Course(String courseName) {
		this.courseName = courseName;
	}
	
	public void addStudent(String student) {
		students[numberOfStudents] = student;
		numberOfStudents++;
		if (numberOfStudents == students.length) {
			String[] students2 = new String[students.length + 5];
			for (int i = 0; i < students.length; i++) {
				students2[i] = students[i];  
			}
			students = students2;
		}
	}

	public String getCourseName() {
		return courseName;
	}

	public String[] getStudents() {
		return students;
	}

	public int getNumberOfStudents() {
		return numberOfStudents;
	}
	
	public void dropStudent(String student) {
		for (int i = 0; i < numberOfStudents; i++) {
			if (students[i].equals(student)) {
				for (int j=i+1; j < numberOfStudents; j++)
					students[j - 1] = students[j];
				numberOfStudents--;
				return;
			}
		}
	}
	
	public void clear() {
		String[] students3 = new String[5];
		students = students3;
	}

}
