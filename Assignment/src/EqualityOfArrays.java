
public class EqualityOfArrays {

	public static void main(String[] args) {
		int[] array1=new int[10];
		int[] array2=new int[10];
		
		for(int i=0 ; i<array1.length;i++)
		{
			//arrayvalues[i]=input.nextInt();
			array2[i]=i*2;
			array1[i]=i*3;
		}
		//for(int i=0 ; i<array1.length;i++)
		//{
			if (array1==array2)
			{
				System.out.println("both are equal");
			}
			else
			{
				System.out.println("both are not equal");
			}
		//}
		
	}

}
