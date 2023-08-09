import java.io.*;
public class Student{
    String name;
    int rollno;
    Student ()
    {
        name="abc";
        rollno=124;
    }
    Student(String str,int n)
    {
        name=str;
        rollno=n;
    }
    public static void main(String[]args)
    {
        Student s1=new Student();
        Student s2=new Student("ade",456);
        System.out.println(s1.name);
        System.out.println(s1.rollno);
        System.out.println(s2.name);
        System.out.println(s2.rollno);
    }
    }
