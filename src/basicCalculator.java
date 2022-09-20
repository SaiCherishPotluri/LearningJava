import java.util.Scanner;
public class basicCalculator {
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
		double fNum, sNum, answer;
		System.out.println("Enter first num: ");
		fNum = userInput.nextDouble();
		System.out.println("Enter second num: ");
		sNum = userInput.nextDouble();
		answer = fNum + sNum;
		System.out.println("Answer: "+answer);
	}
}
