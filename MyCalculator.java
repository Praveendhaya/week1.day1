package Assignment1;

public class MyCalculator {
	public static void main(String[] args) {
		
		
		Calculator mycal = new Calculator();
		int add = mycal.add(10, 15);
		
		System.out.println(mycal.add(10, 15));
		System.out.println(mycal.sub(54, 4));
		System.out.println(mycal.mul(15.5, 2.0));
		System.out.println(mycal.div(8.0f, 2.0f));

	}
}
