/**
 *
 * @author Bhargav
 */
import java.util.*;
public class StringOperations 
{
  public static void main(String args[])
  {
     Scanner in = new Scanner(System.in);
     System.out.println(); 
     StringBuilder sb = new StringBuilder();
     String s;
     
     
     System.out.println("pl enter a string\n");
     s=in.next();
     sb.append(s);
     System.out.println("Length of the String is : "+sb.length());
     System.out.println("Reverse of the string is : "+sb.reverse());
     System.out.println("HASH code of String is : "+sb.hashCode());
     System.out.println("enter a string to relace at the start");
     s = in.next();     
     System.out.println("String after insertion is : "+sb.insert(0, s));   
  }

}
