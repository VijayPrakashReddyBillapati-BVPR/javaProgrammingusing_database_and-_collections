//22. divide string

import java.util.*;
class SplitString {
 static void splitString(String str, int n) {
  int size = str.length();
  int s;
  if (size % n != 0) {
   System.out.println("The size of the given string is not divisible by " + n);
   return;
  } else {
   System.out.println("The given string is: " + str);
   System.out.println("The string divided into " + n + " parts and they are: ");
   s = size / n;
   for (int i = 0; i < size; i++)
   {
    if (i % s == 0)
    	System.out.println();
    System.out.print(str.charAt(i));
   }
  }
 }
 public static void main(String[] args) {
  String str1 = "abcdefghijklmnopqrstuvwxy";
  int num = 5;
  splitString(str1, num);
 }
}