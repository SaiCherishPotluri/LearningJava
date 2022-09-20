import java.util.Scanner;

public class logicalOperators {
	public static void main(String args[]) {
		System.out.println("Welcome to dating site!!! ");
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter name: ");
		String candidateName = userInput.next();
		System.out.println("Enter gender: ");
		String candidateGender = userInput.next();
		System.out.println("Enter age: ");
		int candidateAge = userInput.nextInt();
		
		int girlAge = 58;
		
		if (candidateAge >= 18 && candidateGender == "Male" && girlAge >30) {
			System.out.println("You cannot enter");
		}
		else {
			System.out.println("You can enter");
		}
	}

}
