
class compoundInterest {
	public static void main(String args[]) {
		double amount;
		double principal = 1100;
		double rate = .5;
		
		for(int day =1; day <= 20; day ++) {
			amount = principal*Math.pow(1 + rate, day); // A = P(1+R)^n
			System.out.println(day + " " + amount);
		}
	}

}
