import java.util.Scanner;

public class ifConditionStmt {
	public static void main(String args[]) {
		System.out.println("Enter marks: ");
		Scanner userInput = new Scanner(System.in);
		double marks = userInput.nextDouble();
		
		if (marks == 60) {
			System.out.println("Pass");
		}
		if (marks < 60) {
			System.out.println("Can do better");
		}
		if (marks > 60) {
			System.out.println("Excellent!");
		}
	}

}
