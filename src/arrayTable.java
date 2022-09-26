
public class arrayTable {
	public static void main(String args[]) {
		System.out.println("Index\tValue\tNames");
		int numbers [] = {1,5,7,14,21,44,77};
		String names [] = {"Max","Seb","Kimi","Fernando","Gasley","Lewis","Valterri"};
		
		for (int counter=0;counter<numbers.length;counter++) {
			System.out.println(" "+counter+ "\t" +" "+numbers[counter]+ "\t" +" "+names[counter]);
		}
		
	}

}
