import java.io.*;
class A
{
int a=10;
void display()
{
System.out.println("A");
}
}
class B extends A
{
int b=20;
void show()
{
System.out.println("B");
}
}
class C extends B
{
void dis()
{
System.out.println("c");
}
int c=30;
}
class Multilevel
{
public static void main(String[]args)
{
C obj=new C();
obj.dis();
System.out.println(obj.c);
obj.show();
System.out.println(obj.b);
obj.display();
System.out.println(obj.a);
}
}