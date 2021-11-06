package spring_example_1_2_Container;

public class PetStoreServiceImpl {
	JpaAccountDao accountDao;
	JpaItemDao itemDao;
	
	public JpaAccountDao getAccountDao() {
		return accountDao;
	}
	public void setAccountDao(JpaAccountDao accountDao) {
		this.accountDao = accountDao;
	}
	public JpaItemDao getItemDao() {
		return itemDao;
	}
	public void setItemDao(JpaItemDao itemDao) {
		this.itemDao = itemDao;
	}
	
}
