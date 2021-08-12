
public class StringEqual
{
   public static void main(String[] args)
   {
      String str1 = "abcd";
      String str2 = "abcdefg";
      String str3 = str1 + "efg";
      System.out.println("str2 = " + str2);
      System.out.println("str3 = " + str3);
      if (str2.equals(str3))
         System.out.println("The strings are equal");
      else
         System.out.println("The strings are not equal"); 
      
      int result1 = str2.compareTo(str3);
      
      		if (result1 < 0)
      			System.out.println("Str2 is less than str3.");		
      		else
      			System.out.println("Same");
      		
      int result2 = str2.compareTo(str3);		
      
      		if(result2 > 0)
      			System.out.println("Str2 is greater than str3");	
   }
}
