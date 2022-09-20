import java.util.Scanner;
public class switchStmts {
	public static void main(String args[]) {
		System.out.println("Enter a number between 1 to 7(inclusive): ");
		Scanner userInput = new Scanner(System.in);
		int number = userInput.nextInt();
		
		switch(number) {
		case 1:
			System.out.println("The Day is Monday!");
			break;
		case 2:
			System.out.println("The Day is Tuesday!");
			break;
		case 3:
			System.out.println("The Day is Wednesday!");
			break;
		case 4:
			System.out.println("The Day is Thursday!");
			break;
		case 5:
			System.out.println("The Day is Friday!");
			break;
		case 6:
			System.out.println("The Day is Saturday!");
			break;
		case 7:
			System.out.println("The Day is Sunday!");
			break;
		default:
			System.out.println("You know what day it is!!!!");
		}
	}
}
