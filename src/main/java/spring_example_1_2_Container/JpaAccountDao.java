package spring_example_1_2_Container;

public class JpaAccountDao {
	private int amount;

	public int getAmount() {
		return amount;
	}

	public void setAmount(int amount) {
		this.amount = amount;
	}
	
	public void print() {
		System.out.println("Hi from JpaAccountDao");
	}
	
}
