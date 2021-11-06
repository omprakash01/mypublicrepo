package spring_example_1_5_Scope;

public class ScopeBean {
	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
	}

	public void printMsg() {
		System.out.println("Heloo !!" + this.msg);
	}
}
