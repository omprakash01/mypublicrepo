package spring_NestingAndAlishing;

public class ClientService {
	
	private static ClientService clientService = new ClientService();
    public ClientService() {}

    public static ClientService createInstance() {
    	System.out.println("ClientService Instance created");
        return clientService;
    }
}
