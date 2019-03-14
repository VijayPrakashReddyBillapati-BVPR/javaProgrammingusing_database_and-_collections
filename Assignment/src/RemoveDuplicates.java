//import java.util.Scanner;



public class RemoveDuplicates {

	public static void main(String[] args) {
		//Scanner input = new Scanner(System.in);
		int[] input = new int[]{1, 1, 3, 7, 7, 8, 9, 9, 9, 10};
		
		int current = input[0];
		boolean found = false;

		for (int i = 0; i < input.length; i++) {
		    if (current == input[i] && !found) {
		        found = true;
		    } else if (current != input[i]) {
		        System.out.print(" " + current);
		        current = input[i];
		        found = false;
		    }
		}
		System.out.print(" " + current);
		//for (int k = 0; k < input.length ; k++) 
	         //  System.out.print(input[k] + " "); 

	}

}
