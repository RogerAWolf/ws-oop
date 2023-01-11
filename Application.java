public class Application {
	public static void main (String[] args) {

		int a = 1;
		int b = 4;
		int c = 17;


		System.out.println("A is " + a + " , B is " + b + " en C is " + c + ".");
	
		if(c % b == a){
			System.out.println("C modulo B is A");
		} else {
		System.out.println("C modulo A is niet B");
		}

		if(b > a) {
			System.out.println("B is groter dan A");
		} else {
			System.out.println("B is niet groter dan A");
		}

		if(c * b > a) {
			System.out.println("C*B is groter dan A");
		} else {
			System.out.println("C*B is niet groter dan A");
		}
	}
}