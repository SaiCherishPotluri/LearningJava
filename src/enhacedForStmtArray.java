
public class enhacedForStmtArray {
	public static void main(String args[]) {
		int array[] = {1,2,3,4,5};
		int total = 0;
		
		for(int x: array) {
			total+=x;
//			System.out.println(total);
		}
		System.out.println(total);	
	}
}
