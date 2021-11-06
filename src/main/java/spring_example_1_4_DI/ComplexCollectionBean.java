package spring_example_1_4_DI;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Properties;

public class ComplexCollectionBean {
	List list1 = new ArrayList<String>();
	LinkedHashMap map1 = new LinkedHashMap();
	Properties adminEmails = new Properties();

	public List getList1() {
		return list1;
	}

	public void setList1(List list1) {
		this.list1 = list1;
	}

	public LinkedHashMap getMap1() {
		return map1;
	}

	public void setMap1(LinkedHashMap map1) {
		this.map1 = map1;
	}

	public Properties getAdminEmails() {
		return adminEmails;
	}

	public void setAdminEmails(Properties property) {
		this.adminEmails = property;
	}

	@Override
	public String toString() {
		return "ComplexCollectionBean [list1=" + list1 + ", map1=" + map1 + ", adminEmails=" + adminEmails + "]";
	}

}
