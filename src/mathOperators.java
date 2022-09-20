import java.util.Scanner;

public class mathOperators {
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
		
		int girls, boys, people;
		girls = 11;
		boys = 7;
		people = girls % boys;
		
		System.out.println(people);
	}

}
