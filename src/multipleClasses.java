import java.util.Scanner;

public class multipleClasses {
	public static void main(String args[]) {
		
		System.out.println("Hello, enter name!");
		Scanner userInput = new Scanner(System.in);
		String input = userInput.nextLine();
		
		multipleClasses2 greet = new multipleClasses2();
		greet.sayHi(input);
	}
}
