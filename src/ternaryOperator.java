import java.util.Scanner;
public class ternaryOperator {
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
		System.out.println("Enter age: ");
		int age = userInput.nextInt();
		
		System.out.println(age >= 11 ? "Welcome to Hogwarts" : "You are still too young");
	}

}
