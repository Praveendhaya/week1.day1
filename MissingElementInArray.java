package Assignment1;

import java.util.Arrays;

public class MissingElementInArray {
	public static void main(String[] args) {
	
		int[] arr = {1,2,3,4,5,7};
		int j;
				
		Arrays.sort(arr);
		for(int i =0; i <= arr.length -1; i++)
		{
			if(i+1 != arr[i])
			{
				System.out.println(i+1);
				break;
			}
		}
		
	}
}
