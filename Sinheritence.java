import java.io.*;
class Parent
{
int a=0;
void display()
{
System.out.println("Parent");
}
}
class Child extends Parent
{
int b=34;
void show()
{
System.out.println("Child");
}
}
class Sinheritence
{
public static void main(String[]args)
{
Child obj=new Child();
obj.show();
System.out.println(obj.b);
obj.display();
System.out.println(obj.a);
}
}