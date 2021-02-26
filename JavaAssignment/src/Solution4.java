class Example{
	Example ex;
	public Example() {
		ex = new Example();
	}
}
public class Solution4 {

	public static void main(String[] args) {
		Example ex2 = new Example();
		System.out.println("Hello");

	}

}

// Note : Instance of same class inside same class constructor will get called infinitely due to default
// constructor being called when class is instantiated  