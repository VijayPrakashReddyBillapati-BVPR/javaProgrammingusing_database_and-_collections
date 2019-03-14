
public class ReverseofArray {

	public static void main(String[] args) {
		int[] array1=new int[10];
		
		for(int i=0 ; i<array1.length;i++)
		{
			array1[i]=i*3;
		}
		int n = array1.length-1;
		for(int i=0 ; i<n;i++)
		{
			int temp = array1[i];
			array1[i]= array1[n];
			array1[n]=temp;
			n--;
			
			
		}
		for (int k = 0; k < array1.length ; k++) 
	          System.out.print(array1[k] + " ");

	}

}
