package spring_NestingAndAlishing;

public class AccountService {
	
	private static AccountService clientService = new AccountService();
    public AccountService() {}

    public static AccountService createInstance() {
    	System.out.println("AccountService Instance created");
        return clientService;
    }
}
