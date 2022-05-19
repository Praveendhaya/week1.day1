package Assignment1;

public class TwoWheeler {
	int noOfWheels = 2;
	short noOfMirrors =2;
	long chassisNumber = 54312;
	boolean isPunctured = false;
	String bikeName = "FZ-S";
	double runningKM = 130;
	
	public static void main(String[] args) {
		TwoWheeler mybike = new TwoWheeler();
		System.out.println(mybike.noOfWheels);
		System.out.println(mybike.noOfMirrors);
		System.out.println(mybike.chassisNumber);
		System.out.println(mybike.isPunctured);
		System.out.println(mybike.bikeName);
		System.out.println(mybike.runningKM);
		
}
}
