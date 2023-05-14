package Q3;

import java.util.List;

public class StudentOperation {
	static String getStudentWithMaximumMarks(List<Student> studentList) {
		return null;
		
	}
	
	
	
}


@FunctionalInterface
interface createobj {
       
	Student getobj(int roll,String name, String sub, double marks);
}


@FunctionalInterface

interface tostring {
	String getStudentDetails();
}


@FunctionalInterface
interface StdOp {
	String studentOpString(List<Student> list);
}


