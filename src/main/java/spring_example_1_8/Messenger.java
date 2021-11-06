package spring_example_1_8;

public class Messenger {
	private String message;

	   public void setMessage(String message){
	      this.message  = message;
	   }
	   public void getMessage(){
	      System.out.println("Your Message : " + message);
	   }
	   public void init(){
	      System.out.println("Bean is going through init.");
	   }
	   public void destroy(){
	      System.out.println("Bean will destroy now.");
	   }
}
