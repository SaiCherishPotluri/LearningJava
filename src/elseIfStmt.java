import java.util.Scanner;
public class elseIfStmt {
	public static void main(String args[]) {
		System.out.println("Enter your age: ");
		Scanner userInput = new Scanner(System.in);
		int age = userInput.nextInt();
		if (age < 18) 
			System.out.println("You teenager");
		else if(age > 20 && age < 60) 
			System.out.println("You are an adult");
		else 
			System.out.println("You are a senior citizen");
	}

}
