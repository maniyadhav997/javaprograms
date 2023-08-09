import java.io.*;
class P
{
int a=50;
void display()
{
System.out.println("a");
}
}
class C extends P
{
int b=40;
void show()
{
System.out.println("c");
}
}
class D extends P
{
int c=39;
void dis()
{
System.out.println("D");
}
}
class Hierarchy
{
public static void main(String[]args)
{
C h=new C();
h.show();
System.out.println(h.b);
h.display();
System.out.println(h.a);
D k= new D();
k.dis();
System.out.println(k.c);
k.display();
System.out.println(k.a);
}
}