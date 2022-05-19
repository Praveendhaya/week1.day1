package Assignment1;

public class Calculator {
	public int add(int i, int j) {
		int k = i+j;
		return k;
	 }
	public int sub(int i, int j) {
		int k = i-j;
		return k;
	 }
	public double mul(double i, double j) {
		double k = i*j;
		return k;
	 }
	public float div(float i, float j) {
		float k = i/j;
		return k;
	 }
	

	public static void main(String[] args) {
		
 Calculator calc = new Calculator();
 int add = calc.add(5,2);
 int sub = calc.sub(5,2);
 double mul = calc.mul(5, 2);
 float div = calc.div(5f, 2f);
 System.out.println(add);
 System.out.println(sub);
 System.out.println(mul);
 System.out.println(div);
}
}

