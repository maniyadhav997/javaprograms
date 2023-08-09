import java.io.*;
class P
{
P()
{
System.out.println("parent constructor");
}
int a=39,b=0;
void show()
{
System.out.println("show");
}
void display()
{
System.out.println("PARENT CLASS");
}
}
class C extends P
{
/**super(); implicitly called*/
C()
{
System.out.println("chlid constructor");
}
int a=45;
void display()
{
System.out.println(super.a);
super.display();
System.out.println("CHILD CLASS");
}
}
class Superkeyword
{
public static void main(String[]args)
{
C obj=new C();
System.out.println(obj.b);
obj.display();
System.out.println(obj.a);
obj.show();
}
}