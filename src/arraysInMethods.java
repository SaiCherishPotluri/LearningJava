
public class arraysInMethods {
	public static void main(String args[]) {
		int cherry[]= {3,4,5,6,7,8};
		change(cherry);
		for(int y: cherry) {
			System.out.println(y);
		}
	}
	public static void change(int x[]) {
		for(int counter = 0; counter<x.length; counter++) {
			x[counter]+=5;
		}
	}
}
