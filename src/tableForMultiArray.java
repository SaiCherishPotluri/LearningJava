
public class tableForMultiArray {
	public static void main(String args[]) {
		int firstArr[][] = {{4,5,6},{12,13,14,15}};
		int secondArr[][] = {{30,31,32,33},{43},{4,5,6}};
		
		System.out.println("This is the first array");
		display(firstArr);
		
		System.out.println("This is the second array");
		display(secondArr);
	}

	public static void display(int x[][]) {
		for(int row=0; row<x.length; row++) {
			for(int col=0; col<x[row].length; col++) {
				System.out.print(x[row][col]+"\t");
			}
			System.out.println();
		}
	}
}
