import java.util.Scanner;
public class studentMain {
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
		
		System.out.println("Enter details");
		System.out.println("Enter student name: ");
		String studentName = userInput.nextLine();
		System.out.println("Enter student number: ");
		int studentID = userInput.nextInt();
		
		studentDetails student1 = new studentDetails();
		
		student1.details(studentName, studentID);
		
	}

}
