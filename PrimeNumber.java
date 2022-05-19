package Assignment1;

public class PrimeNumber {
	public static void main(String[] args) {
		
		int input = 16;
		int remainder  = 0;
		boolean flag = false;
		for(int i =2; i <= input/2;i ++) 
		{
			remainder = input%i;
			if (remainder == 0)
				{
				flag = true;
				break;
				
				}
			}
		if(flag == false)
		{
			System.out.println("It is a Prime number");
		}
		else
		{
			System.out.println("Not a Prime number");
		}
	}
			
}
