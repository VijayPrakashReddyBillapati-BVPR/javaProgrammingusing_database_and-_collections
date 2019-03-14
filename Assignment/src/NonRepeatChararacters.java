//21.

public class NonRepeatChararacters{
 public static void main(String[] args) {
  String s = "pool";
  System.out.println("string is: " + s);
  for (int i = 0; i < s.length(); i++)
  {
   boolean unique = true;
   for (int j = 0; j < s.length(); j++) 
   {
    if (i != j && s.charAt(i) == s.charAt(j)) 
    {
     unique = false;
     break;
    }
   }
   if (unique)
   {
    System.out.println("The first non repeated character in String is: " + s.charAt(i));
    break;
   }
  }
 }
}
