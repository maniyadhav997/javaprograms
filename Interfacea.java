import java.io.*;
interface A
{
void Adisplay();
void Ashow();
}
interface C
{
void Cshow();
void Cdisplay();
}
class B implements A,C
{
public void Adisplay()
{
System.out.println("CLASS A");
}
public void Ashow()
{
System.out.println("SHOW A");
}
public void Cdisplay()
{
System.out.println("CLASS C");
}
public void Cshow()
{
System.out.println("SHOW C");
}
}
class Interfacea
{
public static void main(String[]args)
{
B obj=new B();
obj.Adisplay();
obj.Ashow();
obj.Cdisplay();
obj.Cshow();
}
}