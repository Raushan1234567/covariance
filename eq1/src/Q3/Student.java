package Q3;

public class Student {
private int roll;
private String name;
private String Subject;
private double marks;
public Student(int roll, String name, String subject, double marks) {
	super();
	this.roll = roll;
	this.name = name;
	Subject = subject;
	this.marks = marks;
}
public int getRoll() {
	return roll;
}
public void setRoll(int roll) {
	this.roll = roll;
}
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}
public String getSubject() {
	return Subject;
}
public void setSubject(String subject) {
	Subject = subject;
}
public double getMarks() {
	return marks;
}
public void setMarks(double marks) {
	this.marks = marks;
}
@Override
public String toString() {
	return "Student [roll=" + roll + ", name=" + name + ", Subject=" + Subject + ", marks=" + marks + "]";
}


}
