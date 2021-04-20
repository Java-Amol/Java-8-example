package staticInterface;

public class Test {
	public static void main(String[] args) {

		/*
		 * Anonymous obj = new Anonymous() {
		 * 
		 * @Override public void show(int a) { System.out.println("show ()"); }
		 * 
		 * 
		 * };
		 */

		Anonymous obj = (a) -> System.out.println("Hello : "+a);
		obj.show(10);
		System.out.println("hello world");

	}

}
