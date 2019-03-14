import java.util.Scanner;
import java.util.Arrays;

public class FirstTwoSmallestElements {

	public static void main(String[] args) {
		
		
		Scanner input = new Scanner(System.in);
		int arrayvalues[]=new int[6];
		for(int i=0 ; i<arrayvalues.length;i++)
		{
			//arrayvalues[i]=input.nextInt();
			arrayvalues[i]=i*9;
		}
		
		Arrays.sort(arrayvalues);
		
		for(int i=0 ; i<2;i++)
		{
		 System.out.println(arrayvalues[i]);
		}

	}

}
