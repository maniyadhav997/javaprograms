import java.io.*;
class A
{
 void A()
{
int a=10,b=20;
int c=a+b;
System.out.println("sum="+c);
}
void A(int a,int b)
{
int c=a+b;
System.out.println("sum"+c);
}
}
public class Coverload
{
public static void main(String[]args)
{
A obj=new A();
obj.A();
obj.A(40,50);
}
}