
public class InsertionSort {

	public static void main(String[] args) {
		 int[] array = {9,14,3,2,43,11,58,22};    
		 for (int j = 1; j < array.length; j++) {  
	            int key = array[j];  
	            int i = j-1;  
	            while ( (i > -1) && ( array [i] > key ) ) {  
	                array [i+1] = array [i];  
	                i--;  
	            }  
	            array[i+1] = key;  

	}
		 System.out.println("After Insertion Sort");    
	        for(int i:array){    
	            System.out.print(i+" ");    
	        }    

}
}
