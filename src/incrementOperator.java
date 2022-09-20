import java.util.Scanner;
public class incrementOperator {
	public static void main(String args[]) {
		Scanner userInput = new Scanner(System.in);
		
//		int count = 1;
//		System.out.println(count);
//		int number = 9;
//		System.out.println(number);
//	
//		System.out.println("Pre increment");
//		System.out.println(--count);
//		System.out.println(--number);
//		
//		System.out.println("Post increment");
//		System.out.println(count--);
//		System.out.println(count);
//		System.out.println(number--);
//		System.out.println(number);
		
		
		int num1 = 5;
		System.out.println("num1= "+ num1);
		int num2 = 6;
		System.out.println("After Assigning new values");
		num1 = num1 + 5;
		System.out.println("num1= "+ num1);
		num2 = num2 - 2;
		System.out.println("num2= "+ num2);
		
		System.out.println("Assignment Operator");
		num1 += 15;
		System.out.println("num1= "+ num1);
		num2 -= 3;
		System.out.println("num2= "+ num2);
	}

}
