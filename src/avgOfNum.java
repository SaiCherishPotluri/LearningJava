import java.util.Scanner;

public class avgOfNum {
	public static void main(String args[]) {
		int counter = 0,total = 0, grade, average;
		Scanner userInput = new Scanner(System.in);
		
		
		while(counter < 10) {
			System.out.println("Enter number: ");
			grade =  userInput.nextInt();
			total = total + grade;
			counter++;
		}
		average = total/counter;
		System.out.println("Average of numbers: "+average);
	}

}
