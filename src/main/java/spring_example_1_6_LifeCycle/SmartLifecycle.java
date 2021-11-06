package spring_example_1_6_LifeCycle;

public interface SmartLifecycle extends Lifecycle, Phased {
	boolean isAutoStartup();

	void stop(Runnable callback);
}
