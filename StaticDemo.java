import java.io.*;
import java.lang*;
class Demo
{
static int a=10;
static void display()
{
System.out.println("STATIC VARIABLE");
}
static 
{
System.out.println("static block");
}
}
class StaticDemo
{
public static void main(String[]a)
{
System.out.println(a);
display();
}
}
