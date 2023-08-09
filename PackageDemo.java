import pack.Factorial;
import pack.A;
import java.util.*;
import java.io.*;
class PackageDemo
{
public static void main(String[]args)
{
A obj=new A();
obj.display();
Scanner sc=new Scanner(System.in); 
System.out.println("ENTER THE n VALUE");
int n=sc.nextInt();
Factorial fg=new Factorial();
fg.Fact(n);
}
}
