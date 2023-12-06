import java.util.ArrayList;
import java.util.Scanner;

class Student
{
	private String name;
	private int rollNumber;
	private String grade;
	
	public Student(String name, int rollNumber, String grade) {
		this.name = name;
		this.rollNumber = rollNumber;
		this.grade = grade;
	}
	
	public String getName() {
		return name;
	}
	
	public int getRollNumber() {
		return rollNumber;
	}
	
	public String getGrade() {
		return grade;
	}

	@Override
	public String toString() {
		return "Student [name=" + name + ", rollNumber=" + rollNumber + ", grade=" + grade + "]";
	}	
}

class StudentManagementSystem {
	private ArrayList<Student> students = new ArrayList<Student>();
	
	public void addStudent(String name, int rollNumber, String grade) {
		Student student = new Student(name, rollNumber, grade);
		students.add(student);
	}
	
	public void removeStudent(int rollNumber) {
		for(Student student : students) {
			if(student.getRollNumber() == rollNumber) {
			    students.remove(student);
			    return;
			}
		}
		System.out.println("Student with Roll Number " + rollNumber + "not found" );
	 	
	}
	
	public Student findStudent(int rollNumber) {
		for(Student student : students) {
		    if(student.getRollNumber() == rollNumber) {
		    	return student;
		    }
		}
		return null;
	}
	
	public void displayAllStudents() {
		for(Student student : students) {
			System.out.println(student);
		}
	}
}


public class Student_Management_System{
     public static void main(String[] args) {
		StudentManagementSystem sms = new StudentManagementSystem();
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("\n Student Management System");
			System.out.println("1. Add Student");
			System.out.println("2. Remove Student");
			System.out.println("3. Find Student");
			System.out.println("4. Display All Students");
			System.out.println("5. Exit");
			System.out.println("Select an Option: ");
			
			int choice = sc.nextInt();
			sc.nextLine();
			
			switch (choice) {
			case 1:
				 System.out.print("Enter student name: ");
				 String name = sc.nextLine();
				 System.out.print("Enter roll number: ");
				 int rollNumber = sc.nextInt();
				 sc.nextLine();
				 System.out.print("Enter grade: ");
				 String grade = sc.nextLine();
				 sms.addStudent(name, rollNumber, grade);
				 break;
			case 2:
				System.out.println("Enter roll number to remove: ");
				int rollToRemove = sc.nextInt();
				sms.removeStudent(rollToRemove);
				break;
			case 3:
				System.out.println("Enter roll number to find: ");
				int rollToFind = sc.nextInt();
				Student foundStudent = sms.findStudent(rollToFind);
				if(foundStudent != null) {
					System.out.println("Found Student: " + foundStudent);
				}else {
					System.out.println("Student not found.");
				}
				break;
			case 4:
				System.out.println("All Students: ");
				sms.displayAllStudents();
				break;
			case 5:
				System.out.println("Exiting the Program.");
				System.exit(0);
			default:
				System.out.println("Invalid option. Please Select a valid option. ");
					
			}
		}
	}
}