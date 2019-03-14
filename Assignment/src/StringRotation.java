import java.util.*; 
class StringRotation
{
    static boolean check(String str1, String str2)
    {
        return (str1.length() == str2.length()) && ((str1 + str1).indexOf(str2) != -1);
    }
    public static void main (String[] args)
    {
        String str1 = "ABACD";
        String str2 = "CDABA";
		    System.out.println("String: "+str1+","+str2);
		    System.out.println(str1+str1);

        if (check(str1, str2))
        {
		        System.out.println(str2+":present");	
        
        }
        else
        {
          	System.out.println(str2+":not present");	
           
        }
    }
}
