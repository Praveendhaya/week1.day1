package Assignment1;

public class MyCar {
	Car mycarobj = new Car();
	public void callCar()
	{
		mycarobj.applyGear();
		mycarobj.applyAcclerate();
		mycarobj.applyBreak();
		mycarobj.switchonAc();
	}
	public static void main(String[] args) {
		MyCar mycarobj1 = new MyCar();
		mycarobj1.callCar();
}
}