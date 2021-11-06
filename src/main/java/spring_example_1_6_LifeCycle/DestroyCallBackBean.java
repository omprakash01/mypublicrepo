package spring_example_1_6_LifeCycle;

public class DestroyCallBackBean {
	private String str = "Default Messege";
	int a = 1;

	public void cleanup() {
		System.out.println("Hiiiiiiiiii");
		this.str = "Cleaning up done... ";
		this.a = 6;
	}

	public void display() {
		System.out.println(this.str + " -- " + this.a);
	}

}
