package spring_example_1_8;
import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class CustomBeanFactory {

  public static void main(String[] args) throws Exception {

    ConfigurableListableBeanFactory beanFactory = new XmlBeanFactory(new ClassPathResource(
        "beans.xml"));
    
    CustomInitializationMethodNumberClass bean = (CustomInitializationMethodNumberClass)beanFactory.getBean("numberClass");
    
    System.out.println(bean.getNumbers());
  }
}

class CustomInitializationMethodNumberClass {
  private List<String> numbers = new ArrayList<String>();

  public List<String> getNumbers() {
    return this.numbers;
  }

  public void initialize() throws Exception {
    if (this.numbers.size() < 3) {
      numbers.add("one");
      numbers.add("two");
      numbers.add("three");
    }
  }
}
