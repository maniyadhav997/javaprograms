import java.io.*;
import java.lang.*;
class StringDemo2
{
public static void main(String[]args)
{
String str=new String("  hello   ");
System.out.println(str);
System.out.println("length"+str.length());
System.out.println("iindex of "+str.indexOf("h"));
System.out.println("at\t"+str.charAt(2));
System.out.println(str.toLowerCase());
System.out.println(str.toUpperCase());
System.out.println(str.compareTo("HELLO"));
System.out.println(str.trim());
String str2=str.concat("World");
System.out.println(str);
System.out.println(str2);
}
}