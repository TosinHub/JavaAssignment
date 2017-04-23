package lesson1;

public class Student {
	int age;
	static int NoOfStudent = 0;
	
	 public Student(){
		NoOfStudent++;
	}
	
	public static int getNoOfStudents(){
		return NoOfStudent;
		
	}

}
