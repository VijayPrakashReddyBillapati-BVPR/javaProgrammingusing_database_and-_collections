
public class SecondSmallestElement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int[] arrayvalues = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
		int temp;
		
		for (int i=0 ; i<arrayvalues.length;i++)
		{
       
      for (int j =0;j<arrayvalues.length;j++) { 
    	  if(arrayvalues[i]<arrayvalues[j])
    	  {
    		  	temp= arrayvalues[i];
    	  		arrayvalues[i]=arrayvalues[j];
    	  		arrayvalues[j]=temp;
    	  }
      }

	}
		for (int k = 0; k < arrayvalues.length ; k++) 
	          System.out.print(arrayvalues[k] + " "); 
		System.out.println("\n "); 
		//for (int k = 0; k < 2 ; k++) 
	          System.out.print(arrayvalues[1] + " "); 

}
}
