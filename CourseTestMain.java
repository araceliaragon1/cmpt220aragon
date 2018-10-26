
public class CourseTestMain {

	public static void main(String[] args) {
		Course math = new Course("Math"); 
		
		math.addStudent("Danny");
		math.addStudent("Grace");
		math.addStudent("Francely");
		
		math.dropStudent("Francely");
		
		for (int i = 0; i < math.getNumberOfStudents(); i++) {
			System.out.println(math.getStudents()[i]);	
		}
		
	}

}
