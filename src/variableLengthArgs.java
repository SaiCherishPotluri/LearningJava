
public class variableLengthArgs {
	public static void main(String args[]) {
		System.out.println(average(100,100,97,100,100,100,99));
		
	}
	
	public static int average(int...numbers) { // "..." means IDK how many arguements it is going to take
		int total=0;
		for(int x: numbers) {
			total+=x;
		}
		return total/numbers.length;
	}
}
