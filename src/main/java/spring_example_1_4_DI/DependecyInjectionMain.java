package spring_example_1_4_DI;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DependecyInjectionMain {
	public static ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
	public static ApplicationContext complexCollectionContext = new ClassPathXmlApplicationContext(
			"complexCollections.xml");

	public static void main(String[] args) {

		DIUsingConstructor();
		DIUsingSetter();

		// Constructor Argument Resolution
		argumentResolution();

		constructorArgumentTypeMatching();
		constructorArgumentIndex();
		constructorArgumentName();

		// Circular dependencies should give error as expected
		// circularDependencies();

		// Complex Collection
		complexCollection();

		// Collection merging
		collectionMerging();

	}

	public static void DIUsingConstructor() {
		MovieFinder movieFinder = new MovieFinder();
		movieFinder.setMovieName("Avenger!!");

		SimpleMovieLister simpleMovieLister = new SimpleMovieLister(movieFinder);
		simpleMovieLister.displayList();
	}

	public static void DIUsingSetter() {
		MovieFinder movieFinder = new MovieFinder();
		movieFinder.setMovieName("Avenger!!");

		SimpleMovieLister simpleMovieLister = new SimpleMovieLister();
		simpleMovieLister.setMovieFinder(movieFinder);
		simpleMovieLister.displayList();
	}

	public static void argumentResolution() {
		ThingOne thingOne = context.getBean("beanOne", ThingOne.class);
	}

	public static void constructorArgumentTypeMatching() {
		ArgumentResolutionBean thingOne = context.getBean("exampleBean2", ArgumentResolutionBean.class);
		thingOne.print();
	}

	public static void constructorArgumentIndex() {
		ArgumentResolutionBean thingOne = context.getBean("exampleBean2", ArgumentResolutionBean.class);
		thingOne.print();
	}

	public static void constructorArgumentName() {
		ArgumentResolutionBean thingOne = context.getBean("exampleBean3", ArgumentResolutionBean.class);
		thingOne.print();
	}

	/**
	 * Circular dependencies
	 *
	 */
	public static void circularDependencies() {
		CircularA circularA = context.getBean("circularA", CircularA.class);
		circularA.doSomeThing();
	}

	public static void complexCollection() {
		ComplexCollectionBean complexCollectionBean = complexCollectionContext.getBean("complex_object",
				ComplexCollectionBean.class);
		System.out.println(complexCollectionBean);
	}

	public static void collectionMerging() {
		ComplexCollectionBean complexCollectionBean = complexCollectionContext.getBean("child_complex_object",
				ComplexCollectionBean.class);
		System.out.println(complexCollectionBean);
	}

}
