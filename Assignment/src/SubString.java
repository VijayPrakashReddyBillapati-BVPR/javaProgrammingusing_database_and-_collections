 import java.util.*;
public class SubString
{
public String mid(String str) 
{
  int len = str.length();
  String temp= "";
  String r= "";
  int begin = 0;
  int end = 0;
  boolean found = false;
  if (len <= 10)
    return "";
  for (int i = 0; i < len - 4; i++) 
  {
    temp = str.substring(i, i+5);
    if (temp.equals("toast") && found == true)
      end = i; 
    if (temp.equals("toast") && found == false) 
	{
      begin = i+5;
      found = true;
    }
  }
  r = str.substring(begin,end);
  return r;
}
public static void main (String[] args)
    {
	SubString m= new SubString();
      String str1 =  "sweettoastbuttertoast";
      System.out.println("The given strings is: "+str1);
      System.out.println("The new string is: "+m.mid(str1));
	  }
}
