
public class nestedIfStmt {
	public static void main(String args[]) {
		int age = 100;
		if (age <=60) {
			System.out.println("You are old enough");
		}
		else {
			System.out.println("You are too old");
			if (age > 75) {
				System.out.println("You are very old");
			}
			else {
				System.out.println("enough");
			}
		}
	}

}
