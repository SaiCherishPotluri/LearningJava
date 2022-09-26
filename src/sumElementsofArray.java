
public class sumElementsofArray {
	public static void main(String args[]) {
		int numbers[]={21,14,15,18,17,20};
		int sum = 0;
		for (int counter = 0; counter<numbers.length; counter++) {
			sum = sum+numbers[counter];
//			System.out.println(sum);
		}
		System.out.println("The sum of these numbers is "+sum);
	}

}
