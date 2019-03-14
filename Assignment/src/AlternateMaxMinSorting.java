import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;
import java.util.Scanner;

public class AlternateMaxMinSorting {

	public static void main(String[] args) {
				
				Scanner input = new Scanner(System.in);
				int arrayvalues[]=new int[6];
				for(int i=0 ; i<arrayvalues.length;i++)
				{
					//arrayvalues[i]=input.nextInt();
					arrayvalues[i]=i*9;
				}
		     //Arrays.sort (arrayvalues);
				for (int i=0 ; i<arrayvalues.length;i++)
				{
					for (int j=0 ; j<arrayvalues.length;j++)
					{
						if(i%2==0&&(arrayvalues[i]>arrayvalues[j])) 
						{
						int temp = arrayvalues[i]; 
						arrayvalues[i] = arrayvalues[j]; 
						arrayvalues[j] = temp;
						}
						else if(i%2!=0&&(arrayvalues[i]<arrayvalues[j])) 
						{
							int temp = arrayvalues[i]; 
							arrayvalues[i] = arrayvalues[j]; 
							arrayvalues[j] = temp;
						}
					}
		       }
		     
		      // Printing segregated array 
		      for (int k = arrayvalues.length-1; k >=0 ; k--) 
		           System.out.print(arrayvalues[k] + " "); 

		
		

		
		
		
		
		
		
	}

}
