
public class berries {
	private String girlName;
	
	public berries(String name) {
		girlName = name;
	}
	
	public void setName(String name) {
		girlName = name;
	}
	
	public String getName() {
		return girlName;
	}
	
	public void sayings() {
		System.out.printf("My first gf was %s \n",getName());
	}
}
