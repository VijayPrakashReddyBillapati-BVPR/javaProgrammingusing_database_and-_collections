import java.util.Scanner;

public class EvenAndOdd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner input = new Scanner(System.in);
		int arrayvalues[]=new int[6];
		for(int i=0 ; i<arrayvalues.length;i++)
		{
			//arrayvalues[i]=input.nextInt();
			arrayvalues[i]=i*9;
		}
     
		for (int i=0 ; i<arrayvalues.length;i++)
		{
       
      for (int j = arrayvalues.length-1;j != i;j--) { 
          if (arrayvalues[j] % 2 == 0) 
          {  
     
              // Swapping even and 
              // odd numbers 
              int temp = arrayvalues[i]; 
              arrayvalues[i] = arrayvalues[j]; 
              arrayvalues[j] = temp; 
          } 
           
      }
		}
     
      // Printing segregated array 
      for (int k = 0; k < arrayvalues.length; k++) 
           System.out.print(arrayvalues[k] + " "); 
		

	}

}
