package lambdaExression;

public class Test {
	public static void main(String[] args) {

		// Anonymous obj = new Anonymous() {

		/*
		 * public void show() { System.out.println("Hello");
		 * 
		 * }
		 * 
		 * @Override public void printX(int x) {
		 * System.out.println("print value : "+x); } };
		 * 
		 * obj.show(); obj.printX(44);
		 */
		Anonymous lamda = ()-> {
			System.out.println("Hello");
		};
		lamda.show();
	}

	
	
	

}
