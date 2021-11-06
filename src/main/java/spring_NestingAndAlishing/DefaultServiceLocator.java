package spring_NestingAndAlishing;

public class DefaultServiceLocator {
	  private static ClientService clientService = new ClientService();

	    private static AccountService accountService = new AccountService();

	    public ClientService createClientServiceInstance() {
	        return clientService;
	    }

	    public AccountService createAccountServiceInstance() {
	        return accountService;
	    }
}
