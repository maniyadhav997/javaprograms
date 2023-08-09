import.java.io.*;
class StaticDemo
{
static int a=10;
static void display()
{
System.out.println("STATIC VARIABLE");
}
class Main
{
public void main(String[]a);
{
System.out.println(StaticDemo.a);
StaticDemo.display();
}
}