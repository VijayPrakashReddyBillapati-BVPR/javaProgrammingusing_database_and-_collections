//11.Write a Java program to test if a given string contains the specified sequence of char values.
public class SequenceOfChars {
	 public static void main(String[] args)
	    {
	        String str1 = "welcome to this world";
	        String str2 = "world";
	        System.out.println("Original String: " + str1);
	        System.out.println("Specified sequence of char values: " + str2);
	        System.out.println(str1.contains(str2));
	    }

}
