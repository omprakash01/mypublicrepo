package spring_example_1_6_LifeCycle;

public interface LifecycleProcessor extends Lifecycle {
	void onRefresh();

	void onClose();

}
