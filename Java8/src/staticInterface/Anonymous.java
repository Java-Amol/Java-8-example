package staticInterface;

@FunctionalInterface
public interface Anonymous {

	public void show(int a);

	static void printMsg() {
		System.out.println("i am static printmsg method ()");
	}

	static void printHello() {
		System.out.println("i am static hello method ()");
	}

}
