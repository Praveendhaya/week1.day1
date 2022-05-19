package Assignment1;

public class Car {
	public void applyBreak() {
		System.out.println("Apply the brake");
		
	}
	public void applyGear() {
		System.out.println("Apply the gear");
	}
	public void switchonAc() {
		System.out.println("Switch on the AC");
	}
	public void applyAcclerate(){
		System.out.println("Apply the accelerator");
	}
	public static void main(String[] args)
	{
		Car carobj = new Car();
		carobj.applyBreak();
		carobj.applyGear();
		carobj.applyAcclerate();
		carobj.switchonAc();
}
}