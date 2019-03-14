public class StringReplacement {

	public static void main(String[] args) {
		
		String str = "the lion jump into the water";

       
       String new_str = str.replaceAll("lion", "dog");
      
   
       System.out.println("Original string: " + str);
       System.out.println("New String: " + new_str);

	}

}
