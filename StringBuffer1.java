import java.io.*;
import java.lang.*;
public class StringBuffer1
{
public static void main(String[]args)
{
StringBuffer str=new StringBuffer("welcome\t");
System.out.println(str);
str.append("to\tjava");
System.out.println(str);
System.out.println(str.insert(4,"how"));
System.out.println(str.delete(4,7));
System.out.println(str.reverse());
System.out.println(str.length());
System.out.println(str.reverse());
System.out.println(str.indexOf("elcome"));
System.out.println(str.charAt(4));
System.out.println(str.substring(8));
System.out.println(str.subSequence(11,15));
System.out.println(str);


}
}
