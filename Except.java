import java.io.*;
import java.lang.*;
/**class Ex
{
void display()
{
   try
   {
  int a=5/0;
   System.out.println(a);
int a[]=new int[5];
a[6]=5;

}
catch(ArithmeticException e)
{
System.out.println(e);
}
catch(ArrayIndexOutOfBoundsException e)
catch(ArithmeticException e)
{
System.out.println(e);
}
System.out.println("EXCAPTION HANDLE");
}
}**/
class Ex
{
void display()
{
try
{
String str="hello";
int num=Integer.parseInt(str);
}
catch(NumberFormatException e)
{
System.out.println(e);
}
System.out.println("EXCEPTIONHANDLE...");
}
}
class Except
{
public static void main(String[] args)
{
Ex obj=new Ex();
obj.display();
}
}
